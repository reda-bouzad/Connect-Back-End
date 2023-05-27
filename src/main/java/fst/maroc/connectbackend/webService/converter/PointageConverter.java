package fst.maroc.connectbackend.webService.converter;

import fst.maroc.connectbackend.bean.employe.Pointage;
import fst.maroc.connectbackend.webService.dto.PointageDto;

public class PointageConverter {
  public PointageDto toDto (Pointage pointage) {
    PointageDto pointageDto = new PointageDto();
    return pointageDto;
  }
}
