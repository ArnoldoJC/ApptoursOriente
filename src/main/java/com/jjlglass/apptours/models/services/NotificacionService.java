package com.jjlglass.apptours.models.services;

import java.util.List;
import java.util.Optional;

import com.jjlglass.apptours.models.entities.Notificacion;

public interface NotificacionService {
	
	public List<Notificacion> findAll ();
	public Notificacion save(Notificacion entity);
	public Optional<Notificacion> findById (Long id);
	public void delete (Long id);

}