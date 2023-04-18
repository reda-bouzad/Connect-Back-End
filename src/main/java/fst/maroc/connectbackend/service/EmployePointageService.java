package fst.maroc.connectbackend.service;

import fst.maroc.connectbackend.bean.EmployePointage;
import fst.maroc.connectbackend.dao.EmployePointageDao;
import fst.maroc.connectbackend.webService.converter.EmployePointageConverter;
import fst.maroc.connectbackend.webService.dto.EmployePointageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployePointageService {
  @Autowired
  private EmployePointageDao employePointageDao;

  public EmployePointage findByCode(String code) {
    return employePointageDao.findByCode(code);
  }

  public int deleteByCode(String code) {
    return employePointageDao.deleteByCode(code);
  }

  public List<EmployePointageDto> findAll(){
    List<EmployePointage> employePointages = employePointageDao.findAll();
    List<EmployePointageDto> employePointageDtos = new ArrayList<>();
    EmployePointageConverter employePointageConverter = new EmployePointageConverter();
    for(EmployePointage employePointage:employePointages){
      EmployePointageDto employePointageDto = employePointageConverter.toDto(employePointage);
      employePointageDtos.add(employePointageDto);
    }
    return employePointageDtos;
  }
}
