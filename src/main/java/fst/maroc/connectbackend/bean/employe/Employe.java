package fst.maroc.connectbackend.bean.employe;

import fst.maroc.connectbackend.bean.enums.Role;
import fst.maroc.connectbackend.bean.enums.Sexe;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employe {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;
  private String nom;
  private String prenom;
  private String cin;
  private LocalDate dateNaissance;
  private Double salaire;
  private Role role;
  private Sexe sexe;
  private String folderName;
  private String image;

}
