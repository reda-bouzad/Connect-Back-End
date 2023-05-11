package fst.maroc.connectbackend.webService.rest;

import fst.maroc.connectbackend.bean.etudiant.Etudiant;
import fst.maroc.connectbackend.service.EtudiantService;
import fst.maroc.connectbackend.webService.dto.EtudiantDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController()
@RequestMapping("/api/v1/etudiant")
public class EtudiantRest {
  @Autowired
  private EtudiantService etudiantService;
  public Etudiant findByNumero(Long numero) {
    return etudiantService.findByNumero(numero);
  }

  @GetMapping("/")
  public List<EtudiantDto> findAll() {
    return etudiantService.findAllDto();
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
  @DeleteMapping("/numero/{numero}")
  public int deleteByNumero(@PathVariable Long numero) {
    return etudiantService.deleteByNumero(numero);
  }

  @PostMapping("/")
  public int save(@RequestBody Etudiant etudiant) {
    return etudiantService.save(etudiant);
  }

}
