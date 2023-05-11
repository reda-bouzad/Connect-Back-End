package fst.maroc.connectbackend.webService.converter;

import fst.maroc.connectbackend.bean.ecole.Classe;
import fst.maroc.connectbackend.webService.dto.ClasseDto;

public class ClasseConverter {
  public ClasseDto toDto (Classe classe){
    ClasseDto classeDto = new ClasseDto();
    classeDto.setNiveau(classe.getNiveau());
    classeDto.setCode(classe.getCode());
    classeDto.setLibelle(classe.getLibelle());
    return classeDto;
  }

}
