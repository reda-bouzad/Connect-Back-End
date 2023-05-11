package fst.maroc.connectbackend.service;

import fst.maroc.connectbackend.bean.etudiant.Pere;
import fst.maroc.connectbackend.dao.PereDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PereService {
  @Autowired
  private PereDao pereDao;

  public Pere findByCode(String code) {
    return pereDao.findByCode(code);
  }

  public int deleteByCode(String code) {
    return pereDao.deleteByCode(code);
  }

  public List<Pere> findAll() {
    return pereDao.findAll();
  }

  public List<Pere> findByNomIgnoreCase(String nom) {
    return pereDao.findByNomIgnoreCase(nom);
  }

  public List<Pere> findByPrenomIgnoreCase(String prenom) {
    return pereDao.findByPrenomIgnoreCase(prenom);
  }
}
