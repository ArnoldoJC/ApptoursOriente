package com.jjlglass.apptours.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.jjlglass.apptours.models.entities.Categoria;

@Repository
public interface CategoriaRepository extends
CrudRepository<Categoria, Long>{

}
