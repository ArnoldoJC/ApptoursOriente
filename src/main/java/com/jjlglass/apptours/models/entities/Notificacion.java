package com.jjlglass.apptours.models.entities;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="notificacion")
public class Notificacion implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name="Descripcion_Notificacion")
	@NotEmpty
	private String descripcion_Notificacion;
	
	@Column(name="Fecha")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Calendar Fecha;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="sitio_turistico_id", nullable=false)
	private SitioTuristico sitio_turistico;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion_Notificacion() {
		return descripcion_Notificacion;
	}

	public void setDescripcion_Notificacion(String descripcion_Notificacion) {
		this.descripcion_Notificacion = descripcion_Notificacion;
	}

	public Calendar getFecha() {
		return Fecha;
	}

	public void setFecha(Calendar fecha) {
		Fecha = fecha;
	}

	public SitioTuristico getSitio_turistico() {
		return sitio_turistico;
	}

	public void setSitio_turistico(SitioTuristico sitio_turistico) {
		this.sitio_turistico = sitio_turistico;
	}
}
