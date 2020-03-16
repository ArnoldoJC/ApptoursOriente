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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsuario_Turista() {
		return usuario_Turista;
	}

	public void setUsuario_Turista(String usuario_Turista) {
		this.usuario_Turista = usuario_Turista;
	}

	public String getNombre_Turista() {
		return nombre_Turista;
	}

	public void setNombre_Turista(String nombre_Turista) {
		this.nombre_Turista = nombre_Turista;
	}

	public String getCorreo_Electronico() {
		return correo_Electronico;
	}

	public void setCorreo_Electronico(String correo_Electronico) {
		this.correo_Electronico = correo_Electronico;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
