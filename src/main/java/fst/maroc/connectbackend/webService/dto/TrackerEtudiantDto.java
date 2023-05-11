package fst.maroc.connectbackend.webService.dto;

import fst.maroc.connectbackend.bean.enums.Etat;
import fst.maroc.connectbackend.bean.etudiant.Etudiant;
import fst.maroc.connectbackend.bean.enums.Mois;
import lombok.Data;

@Data
public class TrackerEtudiantDto {

  public Long id;
  public Etudiant etudiant;
  public Mois mois;
  public Etat etat;

}
