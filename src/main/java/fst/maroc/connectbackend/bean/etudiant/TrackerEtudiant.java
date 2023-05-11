package fst.maroc.connectbackend.bean.etudiant;

import fst.maroc.connectbackend.bean.enums.Etat;
import fst.maroc.connectbackend.bean.enums.Mois;
import fst.maroc.connectbackend.bean.etudiant.Etudiant;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class TrackerEtudiant {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  public Long id;
  @ManyToOne
  public Etudiant etudiant;
  public Mois mois;
  public Etat etat;
}
