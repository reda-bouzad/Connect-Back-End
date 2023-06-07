package fst.maroc.connectbackend.webService.converter;

import fst.maroc.connectbackend.bean.etudiant.PaiementEtudiant;
import fst.maroc.connectbackend.webService.dto.PaiementEtudiantDto;

public class PaiementEtudiantConverter {

  public PaiementEtudiantDto toDto (PaiementEtudiant paiementEtudiant) {
    PaiementEtudiantDto paiementEtudiantDto = new PaiementEtudiantDto();
    paiementEtudiantDto.setId(paiementEtudiant.getId());
    paiementEtudiantDto.setDate(paiementEtudiant.getDate());
    paiementEtudiantDto.setMois(paiementEtudiant.getMois());
    paiementEtudiantDto.setEtudiant(paiementEtudiant.getEtudiant());
    paiementEtudiantDto.setSomme(paiementEtudiant.getSomme());
    return paiementEtudiantDto;
  }

}
