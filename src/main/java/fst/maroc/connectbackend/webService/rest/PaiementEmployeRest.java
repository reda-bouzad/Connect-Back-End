package fst.maroc.connectbackend.webService.rest;

import fst.maroc.connectbackend.bean.employe.PaiementEmploye;
import fst.maroc.connectbackend.bean.enums.Mois;
import fst.maroc.connectbackend.service.PaiementEmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employe/paiement")
@CrossOrigin("*")
public class PaiementEmployeRest {

  @Autowired
  private PaiementEmployeService paiementEmployeService;

  @GetMapping("/")
  public List<PaiementEmploye> findAll() {
    return paiementEmployeService.findAll();
  }

  @PostMapping("/")
  public int addPayment(@RequestBody PaiementEmploye paiementEmploye) {
    return paiementEmployeService.addPayment(paiementEmploye);
  }

  @GetMapping("/{employeId}")
  public List<PaiementEmploye> findByEmployee(@PathVariable Long employeId) {
    return paiementEmployeService.findByEmployee(employeId);
  }

  @GetMapping("/mois/{mois}")
  public List<PaiementEmploye> findByMois(@PathVariable Mois mois) {
    return paiementEmployeService.findByMois(mois);
  }

}
