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
@Table(name="administrador")
public class Administrador implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="Usuario_Administrador")
	@NotEmpty
	private String usuario_Administrador;
	
	@Column(name="Nombre_Administrador")
	@NotEmpty
	private String nombre_Administrador;
	
	@Column(name="Password")
	@NotEmpty
	private String password;
}
