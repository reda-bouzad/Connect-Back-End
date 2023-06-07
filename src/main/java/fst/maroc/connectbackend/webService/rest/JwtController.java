package fst.maroc.connectbackend.webService.rest;

import fst.maroc.connectbackend.security.JwtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/jwt")
public class JwtController {

  @Autowired
  private JwtService jwtService;

  @GetMapping
  public ResponseEntity<String> sayHello() {
    return ResponseEntity.ok("Hello from secured endpoint");
  }


  @GetMapping("/admin")
  public ResponseEntity<String> adminEndpoint(@RequestHeader("Authorization") String token) {
    boolean isAdmin = jwtService.hasAdminRole(token);
    if (isAdmin) {
      return ResponseEntity.ok("Hello from admin endpoint");
    } else {
      return ResponseEntity.status(HttpStatus.FORBIDDEN).body("You do not have permission to access this endpoint");
    }
  }

}
