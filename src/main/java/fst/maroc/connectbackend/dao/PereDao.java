package fst.maroc.connectbackend.dao;

import fst.maroc.connectbackend.bean.Pere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PereDao extends JpaRepository <Pere, Long> {
  Pere findByCode(String code);
  List<Pere> findByNomIgnoreCase(String nom);
  List<Pere> findByPrenomIgnoreCase(String prenom);
  int deleteByCode(String code);
}
