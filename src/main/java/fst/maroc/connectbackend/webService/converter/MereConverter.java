package fst.maroc.connectbackend.webService.converter;

import fst.maroc.connectbackend.bean.etudiant.Mere;
import fst.maroc.connectbackend.webService.dto.MereDto;

public class MereConverter {
  public MereDto toDto(Mere mere){
    MereDto mereDto = new MereDto();
    mereDto.setCode(mere.getCode());
    mereDto.setNom(mere.getNom());
    mereDto.setPrenom(mere.getPrenom());
    mereDto.setNumeroTelephone(mere.getNumeroTelephone());
    return mereDto;
  }
}
