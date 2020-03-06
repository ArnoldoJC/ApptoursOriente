package com.jjlglass.apptours.models.services;

import java.util.List;
import java.util.Optional;
import com.jjlglass.apptours.models.entities.Administrador;


public interface AdministradorService {
	
	public List<Administrador> findAll ();
	public Administrador save(Administrador entity);
	public Optional<Administrador> findById (Long id);
	public void delete (Long id);


}
