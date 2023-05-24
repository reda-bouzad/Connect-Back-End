package fst.maroc.connectbackend.webService.dto;

import fst.maroc.connectbackend.bean.ecole.Classe;
import fst.maroc.connectbackend.bean.enums.Sexe;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EtudiantDto {
  private String numero;
  private String code;
  private String nom;
  private String prenom;
  private LocalDate  dateNaissance;
  private String niveau;;
  private Classe classe;
  private Sexe sexe;
  private String image;
  private LocalDate dateInscription;

}
