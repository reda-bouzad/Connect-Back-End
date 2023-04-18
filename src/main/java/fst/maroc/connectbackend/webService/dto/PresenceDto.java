package fst.maroc.connectbackend.webService.dto;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class PresenceDto {
  private String code;
  private LocalDate date;
  private Boolean present;
  private Boolean justifier;
  private LocalTime heure;
}
