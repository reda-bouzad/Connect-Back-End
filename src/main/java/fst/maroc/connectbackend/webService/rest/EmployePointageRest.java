package fst.maroc.connectbackend.webService.rest;

import fst.maroc.connectbackend.bean.EmployePointage;
import fst.maroc.connectbackend.service.EmployePointageService;
import fst.maroc.connectbackend.webService.dto.EmployePointageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employe-pointage")
public class EmployePointageRest {
  @Autowired
  private EmployePointageService employePointageService;

  public EmployePointage findByCode(String code) {
    return employePointageService.findByCode(code);
  }

  public int deleteByCode(String code) {
    return employePointageService.deleteByCode(code);
  }
  @GetMapping("/")
  public List<EmployePointageDto> findAll() {
    return employePointageService.findAll();
  }
}
