package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "JPA_POLITICIAN")
@Data
public class Politician 
{
         @Id
         @Column(name = "PID")
       //  @GeneratedValue(strategy = GenerationType.AUTO)
         @SequenceGenerator(name = "gen1", sequenceName="PID_SEQ",initialValue = 1000, allocationSize = 1)
         @GeneratedValue(generator="gen1",strategy = GenerationType.SEQUENCE)
         private Integer id;
         @Column(name = "PNAME",length = 30)
         private String name;
         @Column(name="PAREA",length= 30)
         private String area;
         @Column(name = "PINCOME")
         private Double income;
         @Column(name="PARTY")
         private String party;
         @Column(length = 30)
         private String category;
         @Column(length = 20)
         private Integer age1;
         
         
}
