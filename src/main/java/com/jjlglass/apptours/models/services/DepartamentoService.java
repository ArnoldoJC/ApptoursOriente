package com.jjlglass.apptours.models.services;

import java.util.List;
import java.util.Optional;

import com.jjlglass.apptours.models.entities.Departamento;

public interface DepartamentoService {
	
	public List<Departamento> findAll ();
	public Departamento save(Departamento entity);
	public Optional<Departamento> findById (Long id);
	public void delete (Long id);

}
