package fst.maroc.connectbackend.webService.rest;

import fst.maroc.connectbackend.service.TrackerEtudiantService;
import fst.maroc.connectbackend.webService.dto.TrackerEtudiantDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RequestMapping("api/v1/trackeretudiant")
@RestController
public class TrackerEtudiantRest {

  @Autowired
  public TrackerEtudiantService trackerEtudiantService;

  @GetMapping("/")
  public List<TrackerEtudiantDto> findAllDtos() {
    return trackerEtudiantService.findAllDtos();
  }

}
