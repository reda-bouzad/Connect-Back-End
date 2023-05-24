package fst.maroc.connectbackend.webService.rest;

import fst.maroc.connectbackend.bean.employe.Employe;
import fst.maroc.connectbackend.bean.etudiant.Etudiant;
import fst.maroc.connectbackend.service.EmployeService;
import fst.maroc.connectbackend.webService.dto.EmployeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
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

  @PutMapping("/cin/{cin}")
  public int updateEmployee(@RequestBody Employe employe, @PathVariable String cin){

    // finding the employee
    Employe foundEmployee = employeService.findByCin(cin);

    // updating nom, checking if nom is not null
    if (employe.getNom() != null) {
      foundEmployee.setNom(employe.getNom());
    }

    // updating prénom, checking if prénom is not null
    if (employe.getPrenom() != null) {
      foundEmployee.setPrenom(employe.getPrenom());
    }

    // updating sex, checking if sex is not null
    if (employe.getSexe() != null) {
      foundEmployee.setSexe(employe.getSexe());
    }

    // updating salaire, checking if salaire is not null
    if (employe.getSalaire() != null) {
      foundEmployee.setSalaire(employe.getSalaire());
    }

    // updating role, checking if role is not null
    if (employe.getRole() != null) {
      foundEmployee.setRole(employe.getRole());
    }

    // updating date naissance, checking if date naissance is not null
    if (employe.getSexe() != null) {
      foundEmployee.setSexe(employe.getSexe());
    }

    return employeService.update(foundEmployee);

  }

  @Transactional
  @DeleteMapping("/cin/{cin}")
  public int deleteByCin(@PathVariable String cin) {
    return employeService.deleteByCin(cin);
  }

}
