package fst.maroc.connectbackend.dao.etudiant;

import fst.maroc.connectbackend.bean.enums.Sexe;
import fst.maroc.connectbackend.bean.etudiant.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantDao extends JpaRepository<Etudiant, Long> {

  Etudiant findByCode(String code);

  int deleteByCode(String code);



  int countBySexe(Sexe sexe);

  // custom Queries
  @Query("select e from  Etudiant e where e.ecole.id = 1 ")
  List<Etudiant> findAllEtudiantNahda();

  /*
   @Query("SELECT e FROM Etudiant e WHERE e.ecole = :ecole")
   List<Etudiant> findAllEtudiantNahda(@Param("ecole") Ecole ecole);
  */

}
