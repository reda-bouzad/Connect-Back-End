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

  // findByCin()
  public Employe findByCin(String cin) {
    return employeDao.findByCin(cin);
  }

  // findByNom()
  public Employe findByNomIgnoreCase(String nom) {
    return employeDao.findByNomIgnoreCase(nom);
  }

  // findByPrenom
  public Employe findByPrenomIgnoreCase(String prenom) {
    return employeDao.findByPrenomIgnoreCase(prenom);
  }

  // deleteByCin
  public int deleteByCin(String cin) {
    return employeDao.deleteByCin(cin);
  }

  // number total of employees
  public long count() {
    return employeDao.count();
  }

  // saving an employee
  public int save(Employe employe) {

    // each employee need to have a cin
    if (employe.getCin() == null || employe.getCin().trim().isEmpty()) {
      return -1;
    }

    // each employee need to have a nom
    if (employe.getNom() == null || employe.getNom().trim().isEmpty() ) {
      return -2;
    }

    // each employee need to have a prenom
    if(employe.getPrenom() == null || employe.getPrenom().trim().isEmpty()) {
      return -3;
    }

    // the cin need to have a uniq code
    if (employeDao.findByCin(employe.getCin()) != null){
      return -4;
    }

    // each employee neeed to have a gender
    if (employe.getSexe() == null ) {
      return -5;
    }

    employeDao.save(employe);
    return 1;

  }

  // updating an employee
  public int update(Employe employe){
    employeDao.save(employe);
    return 1;
  }

  // list of all employees only this time using Jpql --> to delete later
  public List<Employe> findAllByJpql() {
    return employeDao.findAllByJpql();
  }

  // list of all employees that have the role Enseignant
  public List<Employe> findByJpqlEnseignant() {
    Role enseignantRole = Role.Enseignant;
    return employeDao.findByJpqlEnseignant(enseignantRole);
  }

  // number total of employees that have the role Enseignant
  public Long countEmployeesByRole() {
    Role enseignantRole = Role.Enseignant;
    return employeDao.countEmployeesByRole(enseignantRole);
  }

  // list of all employees (Dto)
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
