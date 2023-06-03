package fst.maroc.connectbackend.dao.camera;

import fst.maroc.connectbackend.bean.camera.Identified;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdentifiedDao extends JpaRepository<Identified, Long> {

}
