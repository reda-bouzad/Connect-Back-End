package fst.maroc.connectbackend.dao.employe;
import fst.maroc.connectbackend.bean.employe.Employe;
import fst.maroc.connectbackend.bean.enums.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeDao extends JpaRepository<Employe , Long> {

  // findByCin
  Employe findByCin(String cin);

  // findByNom
  Employe findByNomIgnoreCase(String nom);

  // findByPrenom
  Employe findByPrenomIgnoreCase(String prenom);

  // deleteByCin
  int deleteByCin(String cin);

  // findAll
  @Query("select e from Employe e ")
  List<Employe> findAllByJpql();

  // findAllByRole
  @Query("SELECT e FROM Employe e WHERE e.role = :role")
  List<Employe> findByJpqlEnseignant(@Param("role") Role role);

  // countOfEmployeesByRole
  @Query("SELECT COUNT(e) FROM Employe e WHERE e.role = :role")
  Long countEmployeesByRole(@Param("role") Role role);

}
