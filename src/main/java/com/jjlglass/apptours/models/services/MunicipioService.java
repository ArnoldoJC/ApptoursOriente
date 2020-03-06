package com.jjlglass.apptours.models.services;

import java.util.List;
import java.util.Optional;

import com.jjlglass.apptours.models.entities.Municipio;

public interface MunicipioService {
	
	public List<Municipio> findAll ();
	public Municipio save(Municipio entity);
	public Optional<Municipio> findById (Long id);
	public void delete (Long id);

}
