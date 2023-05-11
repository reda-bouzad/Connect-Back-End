package fst.maroc.connectbackend.webService.rest;

import fst.maroc.connectbackend.bean.employe.Employe;
import fst.maroc.connectbackend.service.EmployeService;
import fst.maroc.connectbackend.webService.dto.EmployeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/employe")
public class EmployeRest {
  @Autowired
  private EmployeService employeService;

  public Employe findByCin(String cin) {
    return employeService.findByCin(cin);
  }

  public Employe findByNomIgnoreCase(String nom) {
    return employeService.findByNomIgnoreCase(nom);
  }

  public Employe findByPrenomIgnoreCase(String prenom) {
    return employeService.findByPrenomIgnoreCase(prenom);
  }

  public int deleteByCin(String cin) {
    return employeService.deleteByCin(cin);
  }

  @PostMapping("/")
  public int save(@RequestBody   Employe employe) {
    return employeService.save(employe);
  }

  @GetMapping("/")
  public List<EmployeDto> findAllDtos() {
    return employeService.findAllDtos();
  }

  @GetMapping("/count")
  public long count() {
    return employeService.count();
  }

  @GetMapping("/jpql")
  public List<Employe> findAllByJpql() {
    return employeService.findAllByJpql();
  }

  @GetMapping("/enseignant")
  public List<Employe> findByJpqlEnseignant() {
    return employeService.findByJpqlEnseignant();
  }

  @GetMapping("/countenseignant")
  public Long countEmployeesByRole() {
    return employeService.countEmployeesByRole();
  }
}
