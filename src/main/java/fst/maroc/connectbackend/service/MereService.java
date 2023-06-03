package fst.maroc.connectbackend.service;

import fst.maroc.connectbackend.bean.etudiant.Mere;
import fst.maroc.connectbackend.dao.etudiant.MereDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MereService {
  @Autowired
  private MereDao mereDao;

  public Mere findByCode(String code) {
    return mereDao.findByCode(code);
  }

  public int deleteByCode(String code) {
    return mereDao.deleteByCode(code);
  }

  public List<Mere> findAll() {
    return mereDao.findAll();
  }

  public List<Mere> findByPrenomIgnoreCaseContaining(String nom) {
    return mereDao.findByPrenomIgnoreCaseContaining(nom);
  }
}
