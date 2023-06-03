package fst.maroc.connectbackend.bean.employe;

import fst.maroc.connectbackend.bean.enums.Mois;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PaiementEmploye {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private Double somme;
  private String Remarque;
  @ManyToOne
  private Employe employe;
  private Mois mois;
  private LocalDate date;
}
