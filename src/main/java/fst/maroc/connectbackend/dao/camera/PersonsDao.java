package fst.maroc.connectbackend.dao.camera;

import fst.maroc.connectbackend.bean.camera.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonsDao extends JpaRepository<Persons, Long> {

}
