package fst.maroc.connectbackend.webService.converter;

import fst.maroc.connectbackend.bean.Employe;
import fst.maroc.connectbackend.webService.dto.EmployeDto;

public class EmployeConverter {
  public EmployeDto toDto (Employe employe){
    EmployeDto employeDto = new EmployeDto();

    employeDto.setCin(employe.getCin());
    employeDto.setRole(employe.getRole());
    employeDto.setNom(employe.getNom());
    employeDto.setPrenom(employe.getPrenom());
    employeDto.setSalaire(employe.getSalaire());
    employeDto.setPrime(employe.getPrime());
    employeDto.setDateNaissance(employe.getDateNaissance());

    return employeDto;

  }
}