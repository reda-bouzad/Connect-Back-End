package fst.maroc.connectbackend.service;

import fst.maroc.connectbackend.bean.employe.PaiementEmploye;
import fst.maroc.connectbackend.bean.enums.Mois;
import fst.maroc.connectbackend.dao.employe.EmployeDao;
import fst.maroc.connectbackend.dao.employe.PaiementEmployeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class PaiementEmployeService {

  @Autowired
  private PaiementEmployeDao paimentEmployeDao;

  @Autowired
  private EmployeDao employeDao;

  // list of all Payments
  public List<PaiementEmploye> findAll() {
    return paimentEmployeDao.findAll();
  }

  // adding a new payment
  public int addPayment(PaiementEmploye paiementEmploye){

  

    if (paiementEmploye.getDate() == null ) {
      return -3;
    }

    paimentEmployeDao.save(paiementEmploye);
    return 1;
  }

  // payments for a specific employee
  public List<PaiementEmploye> findByEmployee(Long employeId) {
    return paimentEmployeDao.findByEmploye_Id(employeId);
  }

  // payments for a specific month
  public List<PaiementEmploye> findByMois(Mois mois) {
    return paimentEmployeDao.findByMois(mois);
  }

}
