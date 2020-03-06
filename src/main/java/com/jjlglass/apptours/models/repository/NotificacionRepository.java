package com.jjlglass.apptours.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jjlglass.apptours.models.entities.Notificacion;

@Repository
public interface NotificacionRepository extends
CrudRepository<Notificacion, Long>{

}
