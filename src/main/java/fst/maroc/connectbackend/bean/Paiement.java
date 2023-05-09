package fst.maroc.connectbackend.bean;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.cglib.core.Local;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Paiement {
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
