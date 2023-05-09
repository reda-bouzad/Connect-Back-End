package fst.maroc.connectbackend.dao;

import fst.maroc.connectbackend.bean.Detection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetectionDao extends JpaRepository <Detection,Long> {

}
