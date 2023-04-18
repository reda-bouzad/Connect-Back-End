package fst.maroc.connectbackend.bean;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Etudiant {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private Long numero;
  private String nom;
  private String prenom;
  private Sexe sexe;
  @Column(columnDefinition = "DATE DEFAULT '2001-01-01'")
  private LocalDate dateNaissance;
  @ManyToOne
  private Niveau niveau;
  @ManyToOne
  private Classe classe;
  @ManyToOne
  private Pere pere;
  @ManyToOne
  private Mere mere;
  // private Image image;





}
