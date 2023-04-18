package fst.maroc.connectbackend.webService.dto;

import fst.maroc.connectbackend.bean.Abscence;
import lombok.Data;

@Data
public class EmployePointageDto {
  private Long id;
  private String code;
  private Abscence abscence;
}
