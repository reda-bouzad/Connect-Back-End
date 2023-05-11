package fst.maroc.connectbackend.service;

import fst.maroc.connectbackend.bean.employe.Employe;
import fst.maroc.connectbackend.bean.enums.Role;
import fst.maroc.connectbackend.dao.EmployeDao;
import fst.maroc.connectbackend.webService.converter.EmployeConverter;
import fst.maroc.connectbackend.webService.dto.EmployeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeService {

  @Autowired
  private EmployeDao employeDao;

  public Employe findByCin(String cin) {
    return employeDao.findByCin(cin);
  }

  public Employe findByNomIgnoreCase(String nom) {
    return employeDao.findByNomIgnoreCase(nom);
  }

  public Employe findByPrenomIgnoreCase(String prenom) {
    return employeDao.findByPrenomIgnoreCase(prenom);
  }

  public int deleteByCin(String cin) {
    return employeDao.deleteByCin(cin);
  }

  public long count() {
    return employeDao.count();
  }

  public int save(Employe employe) {
    employeDao.save(employe);
    return 1;
  }

  public List<Employe> findAllByJpql() {
    return employeDao.findAllByJpql();
  }

  public List<Employe> findByJpqlEnseignant() {
    Role enseignantRole = Role.Enseignant;
    return employeDao.findByJpqlEnseignant(enseignantRole);
  }

  public Long countEmployeesByRole() {
    Role enseignantRole = Role.Enseignant;
    return employeDao.countEmployeesByRole(enseignantRole);
  }

  public List<EmployeDto> findAllDtos() {
    List<Employe> employes = employeDao.findAll();
    List<EmployeDto> employeDtos = new ArrayList<>();
    EmployeConverter employeConverter = new EmployeConverter();
    for (Employe employe : employes) {
      EmployeDto employeDto = employeConverter.toDto(employe);
      employeDtos.add(employeDto);
    }
    return employeDtos;
  }

}
