package fst.maroc.connectbackend.service;

import fst.maroc.connectbackend.bean.Etudiant;
import fst.maroc.connectbackend.bean.Sexe;
import fst.maroc.connectbackend.dao.EtudiantDao;
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


  public Etudiant findByNumero(Long numero) {
    return etudiantDao.findByNumero(numero);
  }


  public long count(){ return etudiantDao.count(); }

  public int countMasculin() {
    return etudiantDao.countBySexe(Sexe.MASCULIN);
  }

  public int countFeminin() {
    return etudiantDao.countBySexe(Sexe.FEMENIN);
  }

  public int deleteByNumero(Long numero) {
    return etudiantDao.deleteByNumero(numero);
  }

  public List<EtudiantDto> findAllDto(){
    List<Etudiant> etudiants = etudiantDao.findAll();
    List<EtudiantDto> etudiantDtos = new ArrayList<>();
    EtudiantConverter etudiantConverter = new EtudiantConverter();
    for (Etudiant etudiant:etudiants){
      EtudiantDto etudiantDto = etudiantConverter.toDto(etudiant);
      etudiantDtos.add(etudiantDto);
    }
    return etudiantDtos;
  }

}
