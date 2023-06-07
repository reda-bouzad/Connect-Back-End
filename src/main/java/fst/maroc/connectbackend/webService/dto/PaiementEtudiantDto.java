package fst.maroc.connectbackend.webService.dto;

import fst.maroc.connectbackend.bean.employe.Employe;
import fst.maroc.connectbackend.bean.etudiant.Etudiant;
import fst.maroc.connectbackend.bean.enums.Mois;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
public class PaiementEtudiantDto {
  private Long id;
  private Double somme;
  private LocalDate date;
  private Mois mois;
  private Etudiant etudiant;
}
