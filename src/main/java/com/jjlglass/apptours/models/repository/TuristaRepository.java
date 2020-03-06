package com.jjlglass.apptours.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jjlglass.apptours.models.entities.Turista;

@Repository
public interface TuristaRepository extends
CrudRepository<Turista, Long>{

}