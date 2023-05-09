package fst.maroc.connectbackend.dao;

import fst.maroc.connectbackend.bean.Identified;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IdentifiedDao extends JpaRepository<Identified, Long> {

}
