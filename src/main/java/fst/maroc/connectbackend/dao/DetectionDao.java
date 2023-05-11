package fst.maroc.connectbackend.dao;

import fst.maroc.connectbackend.bean.camera.Detection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetectionDao extends JpaRepository <Detection,Long> {

}
