package fst.maroc.connectbackend.webService.converter;

import fst.maroc.connectbackend.bean.EtudiantAbscence;
import fst.maroc.connectbackend.webService.dto.EtudiantPresenceDto;

public class EtudiantPresenceConverter {
  public EtudiantPresenceDto toDto (EtudiantAbscence etudiantAbscence){
    EtudiantPresenceDto etudiantPresenceDto = new EtudiantPresenceDto();
    etudiantPresenceDto.setCode(etudiantAbscence.getCode());
    etudiantPresenceDto.setEtudiant(etudiantAbscence.getEtudiant());
    etudiantPresenceDto.setAbscence(etudiantAbscence.getAbscence());
    return etudiantPresenceDto;
  }
}
