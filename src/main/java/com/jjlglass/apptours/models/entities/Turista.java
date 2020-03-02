package com.jjlglass.apptours.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.persistence.Id;

@Entity
@Table(name="turista")
public class Turista implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Usuario_Turista")
	@NotEmpty
	private String usuario_Turista;
	
	@Column(name="Nombre_Turista")
	@NotEmpty
	private String nombre_Turista;
	
	@Column(name="Correo_Electronico")
	@NotEmpty
	private String correo_Electronico;
	
	@Column(name="Password")
	@NotEmpty
	private String password;
}
