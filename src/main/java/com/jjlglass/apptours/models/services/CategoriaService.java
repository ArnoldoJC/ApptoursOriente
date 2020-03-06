package com.jjlglass.apptours.models.services;

import java.util.List;
import java.util.Optional;

import com.jjlglass.apptours.models.entities.Categoria;

public interface CategoriaService {
	
	public List<Categoria> findAll ();
	public Categoria save(Categoria entity);
	public Optional<Categoria> findById (Long id);
	public void delete (Long id);

}
