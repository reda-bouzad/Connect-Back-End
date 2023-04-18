package fst.maroc.connectbackend.webService.rest;

import fst.maroc.connectbackend.bean.Mere;
import fst.maroc.connectbackend.service.MereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/mere")
public class MereRest {
  @Autowired
  private MereService mereService;

  public Mere findByCode(String code) {
    return mereService.findByCode(code);
  }

  public int deleteByCode(String code) {
    return mereService.deleteByCode(code);
  }

  @RequestMapping("/")
  public List<Mere> findAll() {
    return mereService.findAll();
  }

  @GetMapping("/nom/{nom}")
  public List<Mere> findByPrenomIgnoreCaseContaining(@PathVariable String nom) {
    return mereService.findByPrenomIgnoreCaseContaining(nom);
  }
}
