package fst.maroc.connectbackend.webService.converter;

import fst.maroc.connectbackend.bean.Classe;
import fst.maroc.connectbackend.webService.dto.ClasseDto;
import lombok.Data;

public class ClasseConverter {
  public ClasseDto toDto (Classe classe){
    ClasseDto classeDto = new ClasseDto();
    classeDto.setNiveau(classe.getNiveau());
    classeDto.setCode(classe.getCode());
    classeDto.setLibelle(classe.getLibelle());
    return classeDto;
  }

}
