package fst.maroc.connectbackend.bean.etudiant;

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
public class PaiementEtudiant {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private Double somme;
  private LocalDate date;
  @Enumerated
  private Mois mois;
  @ManyToOne
  private Etudiant etudiant;
}
