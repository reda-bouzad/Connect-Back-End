package fst.maroc.connectbackend.service;

import fst.maroc.connectbackend.bean.etudiant.TrackerEtudiant;
import fst.maroc.connectbackend.dao.TrackerEtudiantDao;
import fst.maroc.connectbackend.webService.converter.TrackerEtudiantConverter;
import fst.maroc.connectbackend.webService.dto.TrackerEtudiantDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TrackerEtudiantService {

  @Autowired
  public TrackerEtudiantDao trackerEtudiantDao;

  public List<TrackerEtudiantDto> findAllDtos(){
     List<TrackerEtudiant> trackerEtudiants = trackerEtudiantDao.findAll();
     List<TrackerEtudiantDto> trackerEtudiantDtos = new ArrayList<>();
     TrackerEtudiantConverter trackerEtudiantConverter = new TrackerEtudiantConverter();
     for (TrackerEtudiant trackerEtudiant: trackerEtudiants) {
       TrackerEtudiantDto trackerEtudiantDto = trackerEtudiantConverter.toDto(trackerEtudiant);
       trackerEtudiantDtos.add(trackerEtudiantDto);
     }
     return trackerEtudiantDtos;
  }

}
