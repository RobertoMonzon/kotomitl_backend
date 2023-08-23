package com.kotomitl.kotomitl.model;

public class Admin {
	private Long id;
	private String nombre;
	private String email;
	private String password;
	private static long total = 0;
	
	
	public Admin( String nombre, String email, String password) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.password = password;
		Admin.total++;
		this.id=Admin.total;
	}//public Admin


	public Admin() {
		super();
		Admin.total++;
		this.id=Admin.total;
	}// public Admin vacio


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public static long getTotal() {
		return total;
	}


	public static void setTotal(long total) {
		Admin.total = total;
	}


	public String getEmail() {
		return email;
	}


	@Override
	public String toString() {
		return "Admin [id=" + id + ", nombre=" + nombre + ", email=" + email + ", password=" + password + "]";
	}
	
}//public class Admin


