package fst.maroc.connectbackend.webService.rest;

import fst.maroc.connectbackend.bean.Niveau;
import fst.maroc.connectbackend.service.NiveauService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/niveau")
public class NiveauRest {
  @Autowired
  private NiveauService niveauService;

  public Niveau findByCode(String code) {
    return niveauService.findByCode(code);
  }

  public int deleteByCode(String code) {
    return niveauService.deleteByCode(code);
  }
  @RequestMapping("/")
  public List<Niveau> findAll() {
    return niveauService.findAll();
  }
}
