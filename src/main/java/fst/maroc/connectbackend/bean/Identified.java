package fst.maroc.connectbackend.bean;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
@Entity
public class Identified {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private LocalTime time;
  private LocalDate date;
}
