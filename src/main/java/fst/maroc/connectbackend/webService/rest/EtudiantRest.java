package fst.maroc.connectbackend.webService.rest;

import fst.maroc.connectbackend.bean.etudiant.Etudiant;
import fst.maroc.connectbackend.service.EtudiantService;
import fst.maroc.connectbackend.webService.dto.EtudiantDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RestController()
@RequestMapping("/api/v1/etudiant")
public class EtudiantRest {

  @Autowired
  private EtudiantService etudiantService;

  @GetMapping("/")
  public List<EtudiantDto> findAll() {
    return etudiantService.findAllDto();
  }


  @GetMapping("code/{code}")
  public Etudiant findByCode(@PathVariable String code) {
    return etudiantService.findByCode(code);
  }

  @PostMapping("/")
  public int save(@RequestBody Etudiant etudiant) {
    return etudiantService.save(etudiant);
  }

  @PutMapping("/code/{code}")
  public int updateEtudiant(@RequestBody Etudiant etudiant, @PathVariable String code) {

    Etudiant foundEtudiant = etudiantService.findByCode(code);

    // updating nom ,  checking if nom is null
    if ( etudiant.getNom() != null ){
      foundEtudiant.setNom(etudiant.getNom());
    }

    // updating prenom, checking if prenom is null
    if (etudiant.getPrenom() != null ) {
      foundEtudiant.setPrenom(etudiant.getPrenom());
    }

    // updating date d'inscription, checking if date d'inscription is null
    if (etudiant.getDateInscription() != null ) {
      foundEtudiant.setDateInscription(etudiant.getDateInscription());
    }

    // updating sexe, checking if sexe is null
    if (etudiant.getSexe() != null ) {
      foundEtudiant.setSexe(etudiant.getSexe());
    }

    // updating date de naissance, checking if date de naissance is null
    if (etudiant.getDateNaissance() != null ) {
      foundEtudiant.setDateNaissance(etudiant.getDateNaissance());
    }

    return etudiantService.update(foundEtudiant);

  }


  @Transactional
  @DeleteMapping("code/{code}")
  public int deleteByCode(@PathVariable String code) {
    return etudiantService.deleteByCode(code);
  }


  @GetMapping("/count")
  public long count() {
    return etudiantService.count();
  }

  @GetMapping("/sexe-masculin")
  public int countMasculin() {
    return etudiantService.countMasculin();
  }

  @GetMapping("sexe-feminin")
  public int countFeminin() {
    return etudiantService.countFeminin();
  }

  @GetMapping("/nahda")
  public List<Etudiant> etudiantsNahda() {
    return etudiantService.etudiantsNahda();
  }



}
