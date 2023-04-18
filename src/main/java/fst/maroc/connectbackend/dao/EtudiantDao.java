package fst.maroc.connectbackend.dao;

import fst.maroc.connectbackend.bean.Etudiant;
import fst.maroc.connectbackend.bean.Sexe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantDao extends JpaRepository <Etudiant, Long> {
  Etudiant findByNumero(Long numero);
  int countBySexe(Sexe sexe);
  int deleteByNumero(Long numero);
}
