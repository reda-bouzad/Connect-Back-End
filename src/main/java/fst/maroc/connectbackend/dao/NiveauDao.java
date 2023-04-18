package fst.maroc.connectbackend.dao;

import fst.maroc.connectbackend.bean.Niveau;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NiveauDao extends JpaRepository <Niveau , Long> {
  Niveau findByCode(String code);
  int deleteByCode(String code);
}
