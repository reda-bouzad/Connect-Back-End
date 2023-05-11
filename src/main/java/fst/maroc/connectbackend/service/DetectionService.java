package fst.maroc.connectbackend.service;

import fst.maroc.connectbackend.bean.camera.Detection;
import fst.maroc.connectbackend.dao.DetectionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetectionService {
  @Autowired
  private DetectionDao detectionDao;
  public List<Detection> findAll(){
    return detectionDao.findAll();
  }
}
