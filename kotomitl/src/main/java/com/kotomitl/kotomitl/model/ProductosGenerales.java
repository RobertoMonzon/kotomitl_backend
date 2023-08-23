package com.kotomitl.kotomitl.model;

public class ProductosGenerales {
	private Long id;
	private String nombre;
	private String origen;
	private String materiales;
	private String surgerencia;
	private String adicional;
	private String descripcion;
	private static long total = 0;
	
	public ProductosGenerales(String nombre, String origen, String materiales, String surgerencia, String adicional,
			String descripcion) {
		super();
		this.nombre = nombre;
		this.origen = origen;
		this.materiales = materiales;
		this.surgerencia = surgerencia;
		this.adicional = adicional;
		this.descripcion = descripcion;
		ProductosGenerales.total++;
		this.id=ProductosGenerales.total;
	}// public ProductosGeneral

	public ProductosGenerales() {
		super();
		ProductosGenerales.total++;
		this.id=ProductosGenerales.total;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getMateriales() {
		return materiales;
	}

	public void setMateriales(String materiales) {
		this.materiales = materiales;
	}

	public String getSurgerencia() {
		return surgerencia;
	}

	public void setSurgerencia(String surgerencia) {
		this.surgerencia = surgerencia;
	}

	public String getAdicional() {
		return adicional;
	}

	public void setAdicional(String adicional) {
		this.adicional = adicional;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public static long getTotal() {
		return total;
	}

	public static void setTotal(long total) {
		ProductosGenerales.total = total;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "ProductosGeneral [id=" + id + ", nombre=" + nombre + ", origen=" + origen + ", materiales=" + materiales
				+ ", surgerencia=" + surgerencia + ", adicional=" + adicional + ", descripcion=" + descripcion + "]";
	}
	
	
	
	
}
