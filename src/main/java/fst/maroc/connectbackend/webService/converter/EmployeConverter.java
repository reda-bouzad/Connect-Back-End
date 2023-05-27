package fst.maroc.connectbackend.webService.converter;

import fst.maroc.connectbackend.bean.employe.Employe;
import fst.maroc.connectbackend.webService.dto.EmployeDto;

public class EmployeConverter {

  public EmployeDto toDto (Employe employe) {
    EmployeDto employeDto = new EmployeDto();
    employeDto.setId(employe.getId());
    employeDto.setCin(employe.getCin());
    employeDto.setRole(employe.getRole());
    employeDto.setNom(employe.getNom());
    employeDto.setPrenom(employe.getPrenom());
    employeDto.setSalaire(employe.getSalaire());
    employeDto.setDateNaissance(employe.getDateNaissance());
    employeDto.setImage(employe.getImage());
    employeDto.setSexe(employe.getSexe());
    return employeDto;
  }

}
