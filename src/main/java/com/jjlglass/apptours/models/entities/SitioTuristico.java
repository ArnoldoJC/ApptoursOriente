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
@Table(name="sitio_turistico")
public class SitioTuristico implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Nombre_Sitio_Turistico")
	@NotEmpty
	private String nombre_Sitio_Turistico;
	
	@Column(name="Descripcion")
	@NotEmpty
	private String descripcion;
	
	@Column(name="Direccion")
	@NotEmpty
	private String direccion;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="categria_id", nullable=false)
	private Categoria categoria;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="galeria_id", nullable=false)
	private Galeria galeria;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="municipio_id", nullable=false)
	private Municipio municipio;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="restaurante_id", nullable=false)
	private Restaurante restaurante;

}
