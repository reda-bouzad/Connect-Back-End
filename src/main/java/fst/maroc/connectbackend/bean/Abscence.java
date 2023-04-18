package fst.maroc.connectbackend.bean;

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
public class Abscence {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String code;
  private LocalDate date;
  private String periode;
  private String matiere;
  private String enregisterPar;
  private LocalTime heureDebut;
  private LocalTime heureFin;
  // @Column(columnDefinition = "TIME(0) DEFAULT NULL COMMENT 'My Time in HH:MM format'")
  @Enumerated(EnumType.STRING)
  @Column(columnDefinition = "varchar(255) DEFAULT 'PRESENT'")
  private TypeAbscence typeAbscence;

}
