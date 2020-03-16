package com.jjlglass.apptours.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="restaurante")
public class Restaurante implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Nombre_Restaurante")
	@NotEmpty
	private String nombre_Restaurante;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="galeria_id", nullable=false)
	private Galeria galeria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre_Restaurante() {
		return nombre_Restaurante;
	}

	public void setNombre_Restaurante(String nombre_Restaurante) {
		this.nombre_Restaurante = nombre_Restaurante;
	}

	public Galeria getGaleria() {
		return galeria;
	}

	public void setGaleria(Galeria galeria) {
		this.galeria = galeria;
	}
}
