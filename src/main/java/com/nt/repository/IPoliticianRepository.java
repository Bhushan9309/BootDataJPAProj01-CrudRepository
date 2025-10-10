package com.nt.repository;

import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Politician;

public interface IPoliticianRepository extends CrudRepository<Politician, Integer> {

}
