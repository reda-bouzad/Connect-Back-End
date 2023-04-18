package fst.maroc.connectbackend.webService.converter;

import fst.maroc.connectbackend.bean.Etudiant;
import fst.maroc.connectbackend.webService.dto.EtudiantDto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EtudiantConverter {
  public EtudiantDto toDto (Etudiant etudiant){

    EtudiantDto etudiantDto = new EtudiantDto();
    etudiantDto.setNom(etudiant.getNom());
    etudiantDto.setPrenom(etudiant.getPrenom());
    etudiantDto.setNumero(etudiant.getNumero());
    etudiantDto.setNiveau(etudiant.getNiveau());
    etudiantDto.setDateNaissance(formatDateNaissance(etudiant.getDateNaissance()));
    etudiantDto.setClasse(etudiant.getClasse());
    etudiantDto.setSexe(etudiant.getSexe());
    return etudiantDto;
  }
  private String formatDateNaissance(LocalDate dateNaissance) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    return dateNaissance.format(formatter);
  }

}
