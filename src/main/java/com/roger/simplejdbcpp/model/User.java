package com.roger.simplejdbcpp.model;

import java.io.Serializable;

public class User implements Serializable {

	private int idUsuario;
	private String nick;
	private String contrasena;
	private String nombreEmp;

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getNombreEmp() {
		return nombreEmp;
	}

	public void setNombreEmp(String nombreEmp) {
		this.nombreEmp = nombreEmp;
	}

}
