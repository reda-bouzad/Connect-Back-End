package fst.maroc.connectbackend.webService.dto;

import fst.maroc.connectbackend.bean.etudiant.Etudiant;
import fst.maroc.connectbackend.bean.etudiant.Abscence;
import lombok.Data;

@Data
public class EtudiantPresenceDto {
  private String code;
  private Abscence abscence;
  private Etudiant etudiant;
}
