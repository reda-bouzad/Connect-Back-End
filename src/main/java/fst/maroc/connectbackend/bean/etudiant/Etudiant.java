package fst.maroc.connectbackend.bean.etudiant;

import fst.maroc.connectbackend.bean.ecole.Classe;
import fst.maroc.connectbackend.bean.ecole.Ecole;
import fst.maroc.connectbackend.bean.ecole.Niveau;
import fst.maroc.connectbackend.bean.enums.Sexe;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;


import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Etudiant {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String numero;

  private String nom;

  private String prenom;

  private Sexe sexe;

  private String code;

  @Column(columnDefinition = "DATE DEFAULT '2001-01-01'")
  private LocalDate dateNaissance;

  @Column(nullable = false, updatable = false)
  @CreationTimestamp
  private LocalDate dateInscription;

  @ManyToOne
  private Niveau niveau;

  @ManyToOne
  @JoinColumn(columnDefinition = "varchar(255) DEFAULT 'Classe:A'" )
  private Classe classe;

  @ManyToOne
  private Pere pere;

  @ManyToOne
  private Mere mere;

  private String image;

  @ManyToOne
  private Ecole ecole;

  private String folderName;

}
