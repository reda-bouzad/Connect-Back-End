package fst.maroc.connectbackend.dao;

import fst.maroc.connectbackend.bean.employe.Employe;
import fst.maroc.connectbackend.bean.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeDao extends JpaRepository<Employe , Long> {

  Employe findByCin(String cin);

  Employe findByNomIgnoreCase(String nom);

  Employe findByPrenomIgnoreCase(String prenom);

  @Query("select e from Employe e ")
  List<Employe> findAllByJpql();

  @Query("SELECT e FROM Employe e WHERE e.role = :role")
  List<Employe> findByJpqlEnseignant(@Param("role") Role role);

  @Query("SELECT COUNT(e) FROM Employe e WHERE e.role = :role")
  Long countEmployeesByRole(@Param("role") Role role);


  int deleteByCin(String cin);
}
