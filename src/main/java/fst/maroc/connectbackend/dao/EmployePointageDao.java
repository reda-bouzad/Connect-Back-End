package fst.maroc.connectbackend.dao;

import fst.maroc.connectbackend.bean.EmployePointage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployePointageDao extends JpaRepository<EmployePointage , Long> {
  EmployePointage findByCode(String code);
  int deleteByCode(String code);



}
