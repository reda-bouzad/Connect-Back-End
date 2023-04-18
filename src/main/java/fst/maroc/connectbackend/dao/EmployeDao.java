package fst.maroc.connectbackend.dao;

import fst.maroc.connectbackend.bean.Employe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeDao extends JpaRepository<Employe , Long> {
  Employe findByCin(String cin);
  Employe findByNomIgnoreCase(String nom);
  Employe findByPrenomIgnoreCase(String prenom);
  int deleteByCin(String cin);
}
