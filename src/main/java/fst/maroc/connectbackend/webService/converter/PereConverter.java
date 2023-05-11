package fst.maroc.connectbackend.webService.converter;

import fst.maroc.connectbackend.bean.etudiant.Pere;
import fst.maroc.connectbackend.webService.dto.PereDto;

public class PereConverter {
  public PereDto toDto(Pere pere){
    PereDto pereDto = new PereDto();
    pereDto.setNom(pere.getNom());
    pereDto.setPrenom(pere.getPrenom());
    pereDto.setNumeroTelephone(pere.getNumeroTelephone());
    return pereDto;
  }
}
