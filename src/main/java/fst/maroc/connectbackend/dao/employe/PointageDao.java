package fst.maroc.connectbackend.dao.employe;
import fst.maroc.connectbackend.bean.employe.Pointage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface PointageDao extends JpaRepository <Pointage, Long> {



  // return a list of absents in a given day :
  List<Pointage> findByDate(LocalDate date);

  // check if an employee is absent in the current day, we search by id and the current day :
  boolean existsByDateAndEmployeId(LocalDate currentDate, Long employeId);

}
