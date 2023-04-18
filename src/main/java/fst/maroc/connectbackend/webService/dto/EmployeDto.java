package fst.maroc.connectbackend.webService.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class EmployeDto {

  private String nom;
  private String prenom;
  private String cin;
  private LocalDate dateNaissance;
  private Double salaire;
  private String role;
  private String prime;

}
