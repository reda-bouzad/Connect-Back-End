package fst.maroc.connectbackend.dao.etudiant;

import fst.maroc.connectbackend.bean.camera.EtudiantAbscence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EtudiantPresenceDao extends JpaRepository<EtudiantAbscence, Long> {
  EtudiantAbscence findByCode(String code);
  int deleteByCode(String code);
}
