package fst.maroc.connectbackend.dao;

import fst.maroc.connectbackend.bean.etudiant.TrackerEtudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackerEtudiantDao extends JpaRepository <TrackerEtudiant , Long> {

}
