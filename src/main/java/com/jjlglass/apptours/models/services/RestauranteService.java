package com.jjlglass.apptours.models.services;

import java.util.List;
import java.util.Optional;

import com.jjlglass.apptours.models.entities.Restaurante;

public interface RestauranteService {
	
	public List<Restaurante> findAll ();
	public Restaurante save(Restaurante entity);
	public Optional<Restaurante> findById (Long id);
	public void delete (Long id);

}