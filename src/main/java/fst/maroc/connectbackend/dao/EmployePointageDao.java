package fst.maroc.connectbackend.dao;

import fst.maroc.connectbackend.bean.camera.EmployePointage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployePointageDao extends JpaRepository<EmployePointage , Long> {
  EmployePointage findByCode(String code);
  int deleteByCode(String code);

}
