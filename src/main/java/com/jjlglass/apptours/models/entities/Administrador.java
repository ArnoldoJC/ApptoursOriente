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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario_Administrador() {
		return usuario_Administrador;
	}

	public void setUsuario_Administrador(String usuario_Administrador) {
		this.usuario_Administrador = usuario_Administrador;
	}

	public String getNombre_Administrador() {
		return nombre_Administrador;
	}

	public void setNombre_Administrador(String nombre_Administrador) {
		this.nombre_Administrador = nombre_Administrador;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
