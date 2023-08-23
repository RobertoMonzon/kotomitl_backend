package com.kotomitl.kotomitl.model;

public class Compras {
	private Long id;
	private Integer cantidadTotal;
	private String direccion;
	private Double precioTotal;
	private static long total = 0;
	
	
	public Compras(Integer cantidadTotal, String direccion, Double precioTotal) {
		super();
		this.cantidadTotal = cantidadTotal;
		this.direccion = direccion;
		this.precioTotal = precioTotal;
		Compras.total++;
		this.id=Compras.total;
	}


	public Compras() {
		super();
		Compras.total++;
		this.id=Compras.total;
	}


	public Integer getCantidadTotal() {
		return cantidadTotal;
	}


	public void setCantidadTotal(Integer cantidadTotal) {
		this.cantidadTotal = cantidadTotal;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Double getPrecioTotal() {
		return precioTotal;
	}


	public void setPrecioTotal(Double precioTotal) {
		this.precioTotal = precioTotal;
	}


	public static long getTotal() {
		return total;
	}


	public static void setTotal(long total) {
		Compras.total = total;
	}


	public Long getId() {
		return id;
	}


	@Override
	public String toString() {
		return "Compras [id=" + id + ", cantidadTotal=" + cantidadTotal + ", direccion=" + direccion + ", precioTotal="
				+ precioTotal + "]";
	}
	
	
	
	
	
	
	
	

	
}//public class Compras
