package fst.maroc.connectbackend.service;

import fst.maroc.connectbackend.bean.etudiant.Abscence;
import fst.maroc.connectbackend.dao.PresenceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PresenceService {
  @Autowired
  private PresenceDao presenceDao;



  public Abscence findByCode(String code) {
    return presenceDao.findByCode(code);
  }

  public int deleteByCode(String code) {
    return presenceDao.deleteByCode(code);
  }

  public List<Abscence> findAll() {
    return presenceDao.findAll();
  }

}
