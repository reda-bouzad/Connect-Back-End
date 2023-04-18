package fst.maroc.connectbackend.webService.dto;

import fst.maroc.connectbackend.bean.Niveau;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
public class ClasseDto {
  private String code;
  private String libelle;
  private Niveau niveau;
}
