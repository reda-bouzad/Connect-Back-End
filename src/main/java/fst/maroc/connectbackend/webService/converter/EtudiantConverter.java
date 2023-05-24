package fst.maroc.connectbackend.webService.converter;

import fst.maroc.connectbackend.bean.etudiant.Etudiant;
import fst.maroc.connectbackend.webService.dto.EtudiantDto;

public class EtudiantConverter {
  public EtudiantDto toDto (Etudiant etudiant){

    EtudiantDto etudiantDto = new EtudiantDto();
    etudiantDto.setNom(etudiant.getNom());
    etudiantDto.setCode(etudiant.getCode());
    etudiantDto.setPrenom(etudiant.getPrenom());
    etudiantDto.setDateNaissance(etudiant.getDateNaissance());
    etudiantDto.setClasse(etudiant.getClasse());
    etudiantDto.setSexe(etudiant.getSexe());
    etudiantDto.setImage(etudiant.getImage());
    etudiantDto.setNumero(etudiant.getNumero());
    etudiantDto.setDateInscription(etudiant.getDateInscription());
    return etudiantDto;

  }


}
