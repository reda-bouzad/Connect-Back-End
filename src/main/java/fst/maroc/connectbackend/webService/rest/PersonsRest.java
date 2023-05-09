package fst.maroc.connectbackend.webService.rest;

import fst.maroc.connectbackend.bean.Persons;
import fst.maroc.connectbackend.service.PersonsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/persons")
public class PersonsRest {
  @Autowired
  private PersonsService personsService;
  @GetMapping("/")
  public List<Persons> findAll(){
    return personsService.findAll();
  }
}
