package fst.maroc.connectbackend.webService.dto;

import fst.maroc.connectbackend.bean.Classe;
import fst.maroc.connectbackend.bean.Niveau;
import fst.maroc.connectbackend.bean.Sexe;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Data
public class EtudiantDto {
  private Long numero;
  private String nom;
  private String prenom;
  private String  dateNaissance;
  private Niveau niveau;;
  private Classe classe;
  private Sexe sexe;
}
