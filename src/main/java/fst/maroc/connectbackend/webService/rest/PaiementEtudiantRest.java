package fst.maroc.connectbackend.webService.rest;

import fst.maroc.connectbackend.bean.employe.PaiementEmploye;
import fst.maroc.connectbackend.bean.etudiant.PaiementEtudiant;
import fst.maroc.connectbackend.service.PaiementEtudiantService;
import fst.maroc.connectbackend.webService.dto.PaiementEtudiantDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("api/v1/paiementEtudiant")
public class PaiementEtudiantRest {

  @Autowired
  public PaiementEtudiantService paiementEtudiantService;

  @GetMapping("/total")
  public Double revenueTotal() {
    return paiementEtudiantService.revenueTotal();
  }

  @PostMapping("/")
  public int addPayement(@RequestBody PaiementEtudiant paiementEtudiant){
    return paiementEtudiantService.addPayment(paiementEtudiant);
  }

  @GetMapping("/{etudiantId}")
  public List<PaiementEtudiant> findByEmployee(@PathVariable Long etudiantId) {
    return paiementEtudiantService.findByEtudiant(etudiantId);
  }

  @GetMapping("/")
  public List<PaiementEtudiantDto> findAllDtos() {
    return paiementEtudiantService.findAllDtos();
  }


}
