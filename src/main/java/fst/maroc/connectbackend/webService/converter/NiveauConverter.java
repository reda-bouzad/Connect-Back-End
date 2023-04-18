package fst.maroc.connectbackend.webService.converter;

import fst.maroc.connectbackend.bean.Niveau;
import fst.maroc.connectbackend.webService.dto.NiveauDto;

public class NiveauConverter {
  public NiveauDto toDto(Niveau niveau){
    NiveauDto niveauDto = new NiveauDto();
    niveauDto.setCode(niveau.getCode());
    niveauDto.setLibelle(niveau.getLibelle());
    return niveauDto;
  }
}
