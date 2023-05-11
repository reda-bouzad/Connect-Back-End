package fst.maroc.connectbackend.webService.rest;

import fst.maroc.connectbackend.bean.camera.Detection;
import fst.maroc.connectbackend.service.DetectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/detection")
public class DetectionRest {
  @Autowired
  private DetectionService detectionService;
  @GetMapping("/")
  public List<Detection> findAll() {
    return detectionService.findAll();
  }
}
