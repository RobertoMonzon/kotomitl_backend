package com.kotomitl.kotomitl.model;

public class ProductosEspecificos {
	private Long id;
	private Double precio;
	private Integer cantidadStock;
	private String imagen;
	private Integer talla;
	private Integer publico;
	private Integer colores;
	private static long total = 0;
	
	public ProductosEspecificos(Double precio, Integer cantidadStock, String imagen, Integer talla, Integer publico,
			Integer colores) {
		super();
		this.precio = precio;
		this.cantidadStock = cantidadStock;
		this.imagen = imagen;
		this.talla = talla;
		this.publico = publico;
		this.colores = colores;
		ProductosEspecificos.total++;
		this.id=ProductosEspecificos.total;
	}//public ProductosEspecificos constructor

	public ProductosEspecificos() {
		super();
		ProductosEspecificos.total++;
		this.id=ProductosEspecificos.total;	
	}// public ProductosEspecificos vacio

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Integer getCantidadStock() {
		return cantidadStock;
	}

	public void setCantidadStock(Integer cantidadStock) {
		this.cantidadStock = cantidadStock;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Integer getTalla() {
		return talla;
	}

	public void setTalla(Integer talla) {
		this.talla = talla;
	}

	public Integer getPublico() {
		return publico;
	}

	public void setPublico(Integer publico) {
		this.publico = publico;
	}

	public Integer getColores() {
		return colores;
	}

	public void setColores(Integer colores) {
		this.colores = colores;
	}

	public static long getTotal() {
		return total;
	}

	public static void setTotal(long total) {
		ProductosEspecificos.total = total;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "ProductosEspecificos [id=" + id + ", precio=" + precio + ", cantidadStock=" + cantidadStock
				+ ", imagen=" + imagen + ", talla=" + talla + ", publico=" + publico + ", colores=" + colores + "]";
	}
	
	
	
	
	
	

}// public class ProductosEspecificos
