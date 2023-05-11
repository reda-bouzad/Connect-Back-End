package fst.maroc.connectbackend.webService.dto;

import fst.maroc.connectbackend.bean.enums.Role;
import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeDto {

  private String nom;
  private String prenom;
  private String cin;
  private LocalDate dateNaissance;
  private Double salaire;
  private Role role;
  private String image;
  private String prime;

}
