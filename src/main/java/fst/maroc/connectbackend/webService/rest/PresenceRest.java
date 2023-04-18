package fst.maroc.connectbackend.webService.rest;

import fst.maroc.connectbackend.bean.Abscence;
import fst.maroc.connectbackend.service.PresenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/presence")
public class PresenceRest {
  @Autowired
  private PresenceService presenceService;
  public Abscence findByCode(String code) {
    return presenceService.findByCode(code);
  }
  public int deleteByCode(String code) {
    return presenceService.deleteByCode(code);
  }
  @RequestMapping("/")
  public List<Abscence> findAll() {
    return presenceService.findAll();
  }

}
