package fst.maroc.connectbackend.webService.converter;

import fst.maroc.connectbackend.bean.Etudiant;
import fst.maroc.connectbackend.webService.dto.EtudiantDto;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class EtudiantConverter {
  public EtudiantDto toDto (Etudiant etudiant){

    EtudiantDto etudiantDto = new EtudiantDto();
    etudiantDto.setNom(etudiant.getNom());
    etudiantDto.setCode(etudiant.getCode());
    etudiantDto.setPrenom(etudiant.getPrenom());
    etudiantDto.setNumero(etudiant.getNumero());
    etudiantDto.setDateNaissance(etudiant.getDateNaissance());
    etudiantDto.setClasse(etudiant.getClasse());
    etudiantDto.setSexe(etudiant.getSexe());
    etudiantDto.setImage(etudiant.getImage());
    return etudiantDto;
  }


}
