package com.jjlglass.apptours.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jjlglass.apptours.models.entities.SitioTuristico;

@Repository
public interface SitioTuristicoRepository extends
CrudRepository<SitioTuristico, Long>{

}