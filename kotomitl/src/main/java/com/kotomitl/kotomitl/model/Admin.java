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


	


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
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


	public Long getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Admin [id=" + id + ", nombre=" + nombre + ", email=" + email + ", password=" + password + "]";
	}
	
}//public class Admin


