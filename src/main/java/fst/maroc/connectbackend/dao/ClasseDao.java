package fst.maroc.connectbackend.dao;

import fst.maroc.connectbackend.bean.ecole.Classe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasseDao extends JpaRepository <Classe , Long> {
  Classe findByCode(String code);
  int deleteByCode(String code);
}
