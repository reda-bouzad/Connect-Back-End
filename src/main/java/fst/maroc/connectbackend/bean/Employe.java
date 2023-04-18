package fst.maroc.connectbackend.bean;

import jakarta.persistence.Entity;
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
  private long id;
  private String nom;
  private String prenom;
  private String cin;
  private LocalDate dateNaissance;
  private Double salaire;
  private String role;
  private String prime;
  private Sexe sexe;

}
