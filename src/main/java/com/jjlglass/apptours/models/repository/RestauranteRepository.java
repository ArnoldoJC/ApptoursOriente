package com.jjlglass.apptours.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jjlglass.apptours.models.entities.Restaurante;

@Repository
public interface RestauranteRepository extends
CrudRepository<Restaurante, Long>{

}
