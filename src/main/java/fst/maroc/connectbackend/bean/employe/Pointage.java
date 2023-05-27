package fst.maroc.connectbackend.bean.employe;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Pointage {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Temporal(TemporalType.DATE)
  @Column(nullable = false)
  private LocalDate date = LocalDate.now();

  @Column(columnDefinition="tinyint(1) default 1", nullable = false)
  private Boolean present = true;

  @ManyToOne
  private Employe employe;

}
