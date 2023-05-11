package fst.maroc.connectbackend.webService.rest;

import fst.maroc.connectbackend.bean.camera.Identified;
import fst.maroc.connectbackend.service.IdentifiedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/identified")
public class IdentifiedRest {
  @Autowired
  private IdentifiedService identifiedService;
  @GetMapping("/")
  public List<Identified> findAll() {
    return identifiedService.findAll();
  }
}
