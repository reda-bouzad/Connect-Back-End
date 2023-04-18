package fst.maroc.connectbackend.webService.converter;

import fst.maroc.connectbackend.bean.EmployePointage;
import fst.maroc.connectbackend.webService.dto.EmployePointageDto;

public class EmployePointageConverter {
  public EmployePointageDto toDto (EmployePointage employePointage){
    EmployePointageDto employePointageDto = new EmployePointageDto();
    employePointageDto.setAbscence(employePointage.getAbscence());
    employePointageDto.setCode(employePointage.getCode());
    return employePointageDto;
  }
}
