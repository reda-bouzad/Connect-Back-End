package fst.maroc.connectbackend.bean.etudiant;

import fst.maroc.connectbackend.bean.ecole.Classe;
import fst.maroc.connectbackend.bean.ecole.Niveau;
import fst.maroc.connectbackend.bean.enums.Sexe;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

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
  private String code;
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
  private String image;
  private String folderName;

}