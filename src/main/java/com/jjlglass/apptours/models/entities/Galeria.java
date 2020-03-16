package com.jjlglass.apptours.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="galeria")
public class Galeria implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Imagen")
	@NotEmpty
	private String imagen;
	
	@Column(name="Nombre_Imagen")
	@NotEmpty
	private String nombre_Imagen;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getNombre_Imagen() {
		return nombre_Imagen;
	}

	public void setNombre_Imagen(String nombre_Imagen) {
		this.nombre_Imagen = nombre_Imagen;
	}
}
