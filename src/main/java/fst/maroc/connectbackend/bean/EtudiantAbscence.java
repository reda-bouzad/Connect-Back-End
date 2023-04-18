package fst.maroc.connectbackend.bean;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EtudiantAbscence {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String code;
  @ManyToOne
  private Abscence abscence;
  @ManyToOne
  private Etudiant etudiant;
}
