package fst.maroc.connectbackend.service;

import fst.maroc.connectbackend.bean.etudiant.Etudiant;
import fst.maroc.connectbackend.bean.enums.Sexe;
import fst.maroc.connectbackend.dao.etudiant.EtudiantDao;
import fst.maroc.connectbackend.webService.converter.EtudiantConverter;
import fst.maroc.connectbackend.webService.dto.EtudiantDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EtudiantService {

  @Autowired
  private EtudiantDao etudiantDao;

  public List<EtudiantDto>  findAllDto(){
    List<Etudiant> etudiants = etudiantDao.findAll();
    List<EtudiantDto> etudiantDtos = new ArrayList<>();
    EtudiantConverter etudiantConverter = new EtudiantConverter();
    for (Etudiant etudiant:etudiants){
      EtudiantDto etudiantDto = etudiantConverter.toDto(etudiant);
      etudiantDtos.add(etudiantDto);
    }
    return etudiantDtos;
  }

  public Etudiant findByCode(String code){
    return etudiantDao.findByCode(code);
  }

  public int save(Etudiant etudiant){

    // each student need to have a code
    if (etudiant.getCode() == null || etudiant.getCode().trim().isEmpty()) {
      return -1;
    };

    // each student need to have a nom
    if (etudiant.getNom() == null || etudiant.getNom().trim().isEmpty()) {
      return -2;
    };

    if (etudiant.getPrenom() == null || etudiant.getPrenom().trim().isEmpty()) {
      return -3; // each student need to have a prenom
    };

    if ( etudiantDao.findByCode(etudiant.getCode()) != null ) {
      return -4; // the student need to have a uniq code
    };

    if (etudiant.getSexe() == null) {
      return -5; // the student must have a gender male or female
    }

    /* if (etudiant.getNiveau() == null) {
      return -6; // the student must have a niveau
    } */

    etudiantDao.save(etudiant);
    return 1;

  }

  public int update(Etudiant etudiant) {
    etudiantDao.save(etudiant);
    return 1;
  }

  public int deleteByCode(String code) {
    etudiantDao.deleteByCode(code);
    return 1;
  }

  public long count(){ return etudiantDao.count(); }

  public int countMasculin() {
    return etudiantDao.countBySexe(Sexe.Masculin);
  }

  public int countFeminin() {
    return etudiantDao.countBySexe(Sexe.Feminin);
  }

  public List<Etudiant> etudiantsNahda(){
    return etudiantDao.findAllEtudiantNahda();
  }

}
