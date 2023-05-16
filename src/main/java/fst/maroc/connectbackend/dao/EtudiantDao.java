package fst.maroc.connectbackend.dao;

import fst.maroc.connectbackend.bean.ecole.Ecole;
import fst.maroc.connectbackend.bean.etudiant.Etudiant;
import fst.maroc.connectbackend.bean.enums.Sexe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantDao extends JpaRepository <Etudiant, Long> {
  Etudiant findByNumero(Long numero);
  int countBySexe(Sexe sexe);
  int deleteByNumero(Long numero);
  // Return all the students that belongs to the school "Nahda"
  /* Old way
  @Query("SELECT e FROM Etudiant e WHERE e.ecole = :ecole")
  List<Etudiant> findAllEtudiantNahda(@Param("ecole") Ecole ecole);
  */
  @Query("select e from  Etudiant e where e.ecole.id = 1 ")
  List<Etudiant> findAllEtudiantNahda();

}
