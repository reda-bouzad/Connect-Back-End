package fst.maroc.connectbackend.webService.converter;

import fst.maroc.connectbackend.bean.etudiant.TrackerEtudiant;
import fst.maroc.connectbackend.webService.dto.TrackerEtudiantDto;

public class TrackerEtudiantConverter {
  public TrackerEtudiantDto toDto(TrackerEtudiant trackerEtudiant){
    TrackerEtudiantDto trackerEtudiantDto = new TrackerEtudiantDto();
    trackerEtudiantDto.setId(trackerEtudiant.getId());
    trackerEtudiantDto.setEtudiant(trackerEtudiant.getEtudiant());
    trackerEtudiantDto.setMois(trackerEtudiant.getMois());
    trackerEtudiantDto.setEtat(trackerEtudiant.getEtat());
    return trackerEtudiantDto;
  }
}
