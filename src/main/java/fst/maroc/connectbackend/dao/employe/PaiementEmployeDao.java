package fst.maroc.connectbackend.dao.employe;

import fst.maroc.connectbackend.bean.employe.PaiementEmploye;
import fst.maroc.connectbackend.bean.enums.Mois;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PaiementEmployeDao extends JpaRepository<PaiementEmploye, Long> {

  List<PaiementEmploye> findByEmploye_Id(Long employeId);
  List<PaiementEmploye> findByMois(Mois mois);

}
