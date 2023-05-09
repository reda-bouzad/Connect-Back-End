package fst.maroc.connectbackend.bean;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "detection")
public class Detection {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  @JoinColumn(name = "identified_id")
  @ManyToOne
  private Identified identified;
  @JoinColumn(name = "etudiant_id")
  @ManyToOne
  private Etudiant etudiant;
}
