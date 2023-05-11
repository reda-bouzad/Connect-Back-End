package fst.maroc.connectbackend.service;

import fst.maroc.connectbackend.bean.etudiant.PaiementEtudiant;
import fst.maroc.connectbackend.dao.PaiementEtudiantDao;
import fst.maroc.connectbackend.webService.converter.PaiementEtudiantConverter;
import fst.maroc.connectbackend.webService.dto.PaiementEtudiantDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaiementEtudiantService {

  @Autowired
  public PaiementEtudiantDao paiementEtudiantDao;

  public Double revenueTotal(){
    return  paiementEtudiantDao.revenueTotal();
  }

  public List<PaiementEtudiantDto> findAllDtos(){
    List<PaiementEtudiant> paiementEtudiants = paiementEtudiantDao.findAll();
    List <PaiementEtudiantDto> paiementEtudiantDtos = new ArrayList<>();
    PaiementEtudiantConverter paiementEtudiantConverter = new PaiementEtudiantConverter();
    for(PaiementEtudiant paiementEtudiant : paiementEtudiants){
      PaiementEtudiantDto paiementEtudiantDto = paiementEtudiantConverter.toDto(paiementEtudiant);
      paiementEtudiantDtos.add(paiementEtudiantDto);
    }
    return paiementEtudiantDtos;
  }
}