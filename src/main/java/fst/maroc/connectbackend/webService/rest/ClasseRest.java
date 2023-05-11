package fst.maroc.connectbackend.webService.rest;

import fst.maroc.connectbackend.bean.ecole.Classe;
import fst.maroc.connectbackend.service.ClasseService;
import fst.maroc.connectbackend.webService.dto.ClasseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/classe")
public class ClasseRest {
  @Autowired
  private ClasseService classeService;

  public Classe findByCode(String code) {
    return classeService.findByCode(code);
  }

  public int deleteByCode(String code) {
    return classeService.deleteByCode(code);
  }
  @GetMapping("/")
  public List<ClasseDto> findAll() {
    return classeService.findAllDtos();
  }
}
