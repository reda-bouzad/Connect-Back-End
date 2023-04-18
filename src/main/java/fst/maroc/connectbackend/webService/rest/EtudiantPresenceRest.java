package fst.maroc.connectbackend.webService.rest;

import fst.maroc.connectbackend.bean.EtudiantAbscence;
import fst.maroc.connectbackend.service.EtudiantPresenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/etudiant-presence")

public class EtudiantPresenceRest {
  @Autowired
  private EtudiantPresenceService etudiantPresenceService;

  public EtudiantAbscence findByCode(String code) {
    return etudiantPresenceService.findByCode(code);
  }

  public int deleteByCode(String code) {
    return etudiantPresenceService.deleteByCode(code);
  }
  @GetMapping("/")
  public List<EtudiantAbscence> findAll() {
    return etudiantPresenceService.findAll();
  }
}
