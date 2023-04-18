package fst.maroc.connectbackend.service;

import fst.maroc.connectbackend.bean.EtudiantAbscence;
import fst.maroc.connectbackend.dao.EtudiantPresenceDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EtudiantPresenceService {
  @Autowired
  private EtudiantPresenceDao etudiantPresenceDao;

  public EtudiantAbscence findByCode(String code) {
    return etudiantPresenceDao.findByCode(code);
  }

  public int deleteByCode(String code) {
    return etudiantPresenceDao.deleteByCode(code);
  }

  public List<EtudiantAbscence> findAll() {
    return etudiantPresenceDao.findAll();
  }
}
