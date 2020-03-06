package com.jjlglass.apptours.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jjlglass.apptours.models.entities.Municipio;

@Repository
public interface MunicipioRepository extends
CrudRepository<Municipio, Long>{

}