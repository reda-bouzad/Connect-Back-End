package fst.maroc.connectbackend.webService.dto;

import fst.maroc.connectbackend.bean.Etudiant;
import fst.maroc.connectbackend.bean.Abscence;
import lombok.Data;

@Data
public class EtudiantPresenceDto {
  private String code;
  private Abscence abscence;
  private Etudiant etudiant;
}
