package fst.maroc.connectbackend.dao.etudiant;

import fst.maroc.connectbackend.bean.etudiant.Abscence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresenceDao extends JpaRepository<Abscence, Long> {
  Abscence findByCode(String code);
  int deleteByCode(String code);
}
