package fst.maroc.connectbackend.dao;

import fst.maroc.connectbackend.bean.etudiant.PaiementEtudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementEtudiantDao extends JpaRepository<PaiementEtudiant, Long> {
  @Query("select sum(p.somme) from PaiementEtudiant p")
  Double revenueTotal();
}
