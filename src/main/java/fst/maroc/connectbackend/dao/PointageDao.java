package fst.maroc.connectbackend.dao;
import fst.maroc.connectbackend.bean.employe.Pointage;
import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface PointageDao extends JpaRepository <Pointage, Long> {

  List<Pointage> findByDate(LocalDate date);


    boolean existsByDateAndEmployeId(LocalDate currentDate, Long employeId);
}
