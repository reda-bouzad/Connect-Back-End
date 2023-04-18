package fst.maroc.connectbackend.webService.converter;

import fst.maroc.connectbackend.bean.Abscence;
import fst.maroc.connectbackend.webService.dto.PresenceDto;

public class PresenceConverter {
  public PresenceDto toDto(Abscence abscence){
    PresenceDto presenceDto = new PresenceDto();
    presenceDto.setCode(abscence.getCode());
    presenceDto.setDate(abscence.getDate());
    return presenceDto;
  }
}
