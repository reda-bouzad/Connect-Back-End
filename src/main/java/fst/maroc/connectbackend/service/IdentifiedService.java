package fst.maroc.connectbackend.service;

import fst.maroc.connectbackend.bean.camera.Identified;
import fst.maroc.connectbackend.dao.IdentifiedDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdentifiedService {
  @Autowired
  private IdentifiedDao identifiedDao;

  public List<Identified> findAll() {
    return identifiedDao.findAll();
  }

}
