package com.jjlglass.apptours.models.services;

import java.util.List;
import java.util.Optional;

import com.jjlglass.apptours.models.entities.Galeria;

public interface GaleriaService {
	
	public List<Galeria> findAll ();
	public Galeria save(Galeria entity);
	public Optional<Galeria> findById (Long id);
	public void delete (Long id);

}
