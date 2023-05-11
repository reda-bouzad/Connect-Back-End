package fst.maroc.connectbackend.bean.camera;

import fst.maroc.connectbackend.bean.camera.Identified;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "persons")
public class Persons {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "identified_id")
  private Identified identifiedId;

  @Column(name = "person")
  private String person;

}
