package fst.maroc.connectbackend.service;

import fst.maroc.connectbackend.bean.employe.Employe;
import fst.maroc.connectbackend.bean.employe.Pointage;
import fst.maroc.connectbackend.dao.EmployeDao;
import fst.maroc.connectbackend.dao.PointageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class PointageService {

  @Autowired
  private PointageDao pointageDao;

  @Autowired
  private EmployeDao employeDao;


  public List<Pointage> findAll() {
    return pointageDao.findAll();
  }

  public List<Pointage> findByDate(LocalDate date) {
    return pointageDao.findByDate(date);
  }

  public int save(Pointage pointage) {
    pointageDao.save(pointage);
    return 1;
  }


  public boolean existsByDateAndEmployeId(Long employeId) {
    LocalDate currentDate = LocalDate.now();
    return pointageDao.existsByDateAndEmployeId(currentDate, employeId);
  }
}
