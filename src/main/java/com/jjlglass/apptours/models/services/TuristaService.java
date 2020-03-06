package com.jjlglass.apptours.models.services;

import java.util.List;
import java.util.Optional;

import com.jjlglass.apptours.models.entities.Turista;

public interface TuristaService {
	
	public List<Turista> findAll ();
	public Turista save(Turista entity);
	public Optional<Turista> findById (Long id);
	public void delete (Long id);

}
