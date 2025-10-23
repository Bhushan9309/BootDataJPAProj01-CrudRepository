package com.nt.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "JPA_POLITICIAN")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
public class Politician 
{
         @Id
         @Column(name = "PID")
         @GeneratedValue(strategy = GenerationType.AUTO)
       //@SequenceGenerator(name = "gen1", sequenceName="PID_SEQ",initialValue = 1000, allocationSize = 1)
       // @GeneratedValue(generator="gen1",strategy = GenerationType.SEQUENCE)
       //  @GeneratedValue(strategy = GenerationType.IDENTITY)
         private Integer id;
         @Column(name = "PNAME",length = 30)
         @NonNull
         private String name;
         
         @Column(name="PAREA",length= 30)
         @NonNull
         private String area;
         
         @Column(name = "PINCOME")
         @NonNull
         private Double income;
         
         @Column(name="PARTY")
         @NonNull
         private String party;
         
         @Column(length = 30)
         @NonNull
         private String category;
         
         @Column(length = 20)
         @NonNull
         @Transient
         private Integer age1;
         
         
}
