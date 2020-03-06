package com.jjlglass.apptours.models.services;

import java.util.List;
import java.util.Optional;

import com.jjlglass.apptours.models.entities.SitioTuristico;

public interface SitioTuristicoService {
	
	public List<SitioTuristico> findAll ();
	public SitioTuristico save(SitioTuristico entity);
	public Optional<SitioTuristico> findById (Long id);
	public void delete (Long id);

}
