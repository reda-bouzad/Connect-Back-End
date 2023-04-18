package fst.maroc.connectbackend.service;

import fst.maroc.connectbackend.bean.Classe;
import fst.maroc.connectbackend.dao.ClasseDao;
import fst.maroc.connectbackend.webService.converter.ClasseConverter;
import fst.maroc.connectbackend.webService.dto.ClasseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClasseService {
  @Autowired
  private ClasseDao classeDao;

  public Classe findByCode(String code) {
    return classeDao.findByCode(code);
  }

  public int deleteByCode(String code) {
    return classeDao.deleteByCode(code);
  }

  public List<ClasseDto> findAllDtos(){
    List<Classe> classes = classeDao.findAll();
    List<ClasseDto> classeDtos = new ArrayList<>();
    ClasseConverter classeConverter = new ClasseConverter();
    for (Classe classe:classes){
      ClasseDto classeDto = classeConverter.toDto(classe);
      classeDtos.add(classeDto);
    }
    return classeDtos;
  }

}
