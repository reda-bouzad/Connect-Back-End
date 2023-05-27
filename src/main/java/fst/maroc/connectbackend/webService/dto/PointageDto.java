package fst.maroc.connectbackend.webService.dto;

import fst.maroc.connectbackend.bean.employe.Employe;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class PointageDto {

  private Long id;
  @Temporal(TemporalType.DATE)
  private LocalDate date;
  private Boolean present;
  private Employe employe;

}
