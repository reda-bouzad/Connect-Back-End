package fst.maroc.connectbackend.webService.rest;

import fst.maroc.connectbackend.bean.employe.Employe;
import fst.maroc.connectbackend.bean.employe.Pointage;
import fst.maroc.connectbackend.service.EmployeService;
import fst.maroc.connectbackend.service.PointageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/pointage")
@CrossOrigin("*")
public class PointageRest {

  @Autowired
  private PointageService pointageService;

  @Autowired
  private EmployeService employeService;

  @GetMapping("/")
  public List<Pointage> findAll(){
    return pointageService.findAll();
  }

  @GetMapping("/date/{date}")
  public List<Pointage> findByDate(@PathVariable LocalDate date) {
    return pointageService.findByDate(date);
  }

  // Returns if an employee is present or not
  @GetMapping("/check/{employeId}")
  public boolean getEmployeePointage(@PathVariable Long employeId){
    return pointageService.existsByDateAndEmployeId(employeId);
  }

  @PostMapping("/")
  public int present(@RequestBody Pointage pointage) {
    pointageService.save(pointage);
    System.out.printf(String.valueOf(pointage));
    return 1;
  }

}
