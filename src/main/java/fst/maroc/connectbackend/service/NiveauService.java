package fst.maroc.connectbackend.service;

import fst.maroc.connectbackend.bean.ecole.Niveau;
import fst.maroc.connectbackend.dao.etudiant.NiveauDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class NiveauService {
  @Autowired
  private NiveauDao niveauDao;

  public Niveau findByCode(String code) {
    return niveauDao.findByCode(code);
  }

  public int deleteByCode(String code) {
    return niveauDao.deleteByCode(code);
  }

  public List<Niveau> findAll() {
    return niveauDao.findAll();
  }


}
