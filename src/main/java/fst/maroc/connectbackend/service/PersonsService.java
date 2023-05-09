package fst.maroc.connectbackend.service;

import fst.maroc.connectbackend.bean.Persons;
import fst.maroc.connectbackend.dao.PersonsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonsService {
  @Autowired
  private PersonsDao personsDao;
  public List<Persons> findAll(){
    return personsDao.findAll();
  }
}
