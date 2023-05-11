package fst.maroc.connectbackend.dao;

import fst.maroc.connectbackend.bean.etudiant.Mere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MereDao extends JpaRepository <Mere, Long> {
  Mere findByCode(String code);
  int deleteByCode(String code);
  List<Mere> findByPrenomIgnoreCaseContaining(String nom);
}
