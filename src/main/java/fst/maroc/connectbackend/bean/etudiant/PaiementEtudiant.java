package fst.maroc.connectbackend.bean.etudiant;

import fst.maroc.connectbackend.bean.employe.Employe;
import fst.maroc.connectbackend.bean.enums.Mois;
import fst.maroc.connectbackend.bean.etudiant.Etudiant;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PaiementEtudiant {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String ref;
  private LocalDate date;
  private LocalTime heure;
  private Double somme;
  @ManyToOne
  private Employe employe;
  private Mois mois;
  @ManyToOne
  private Etudiant etudiant;
}
