package fst.maroc.connectbackend.webService.dto;

import fst.maroc.connectbackend.bean.employe.Employe;
import fst.maroc.connectbackend.bean.etudiant.Etudiant;
import fst.maroc.connectbackend.bean.enums.Mois;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class PaiementEtudiantDto {
  private Long id;
  private String ref;
  private LocalDate date;
  private LocalTime heure;
  private Double somme;
  private Employe employe;
  private Mois mois;
  private Etudiant etudiant;
}
