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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre_Sitio_Turistico() {
		return nombre_Sitio_Turistico;
	}

	public void setNombre_Sitio_Turistico(String nombre_Sitio_Turistico) {
		this.nombre_Sitio_Turistico = nombre_Sitio_Turistico;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Galeria getGaleria() {
		return galeria;
	}

	public void setGaleria(Galeria galeria) {
		this.galeria = galeria;
	}

	public Municipio getMunicipio() {
		return municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public Restaurante getRestaurante() {
		return restaurante;
	}

	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}

}
