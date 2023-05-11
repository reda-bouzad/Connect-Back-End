package fst.maroc.connectbackend.bean.camera;

import fst.maroc.connectbackend.bean.etudiant.Abscence;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class EmployePointage {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String code;
  @ManyToOne
  private Abscence abscence;
}
