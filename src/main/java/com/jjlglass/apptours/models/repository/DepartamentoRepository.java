package com.jjlglass.apptours.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jjlglass.apptours.models.entities.Departamento;

@Repository
public interface DepartamentoRepository extends
CrudRepository<Departamento, Long>{

}
