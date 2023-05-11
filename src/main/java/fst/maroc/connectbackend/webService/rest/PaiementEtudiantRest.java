package fst.maroc.connectbackend.webService.rest;

import fst.maroc.connectbackend.service.PaiementEtudiantService;
import fst.maroc.connectbackend.webService.dto.PaiementEtudiantDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

  @GetMapping("/")
  public List<PaiementEtudiantDto> findAllDtos() {
    return paiementEtudiantService.findAllDtos();
  }
}
