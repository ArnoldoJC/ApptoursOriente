package com.jjlglass.apptours.models.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jjlglass.apptours.models.repository.NotificacionRepository;
import com.jjlglass.apptours.models.entities.Notificacion;

@Service
public class NotificacionServiceImpl implements NotificacionService {

	
	@Autowired
	public NotificacionRepository repository;

	@Override
	public List<Notificacion> findAll() {
		return (List<Notificacion>) repository.findAll();
	}

	@Override
	public Notificacion save(Notificacion entity) {
		return repository.save(entity);
	}

	@Override
	public Optional<Notificacion> findById(Long id) {
		return repository .findById(id);
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);
		
	}
	
	
}

