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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Notificacion save(Notificacion entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Notificacion> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		
	}
	
	
}

