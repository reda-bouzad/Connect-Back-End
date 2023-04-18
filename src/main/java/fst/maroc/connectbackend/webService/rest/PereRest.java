package fst.maroc.connectbackend.webService.rest;

import fst.maroc.connectbackend.bean.Pere;
import fst.maroc.connectbackend.service.PereService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/pere")
public class PereRest {
  @Autowired
  private PereService pereService;

  public Pere findByCode(String code) {
    return pereService.findByCode(code);
  }

  public int deleteByCode(String code) {
    return pereService.deleteByCode(code);
  }
  @RequestMapping("/")
  public List<Pere> findAll() {
    return pereService.findAll();
  }

  @RequestMapping("/nom/{nom}")
  public List<Pere> findByNomIgnoreCase(@PathVariable String nom) {
    return pereService.findByNomIgnoreCase(nom);
  }
  @RequestMapping("/prenom/{prenom}")
  public List<Pere> findByPrenomIgnoreCase(@PathVariable String prenom) {
    return pereService.findByPrenomIgnoreCase(prenom);
  }
}
