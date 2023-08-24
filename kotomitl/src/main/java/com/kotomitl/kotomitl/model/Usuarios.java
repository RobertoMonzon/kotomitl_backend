package com.kotomitl.kotomitl.model;

//import javax.persistence.Entity;
//import javax.persistence.Table;

//@Entity
//@Table(name="usuario")
public class Usuarios {
	
	private Long id ;
	private String nombre;
	private String apellido;
	private String telefono;
	private String password;
	private String calle ;
	private String numero ;
	private Integer cp;
	private String colonia ;
	private String ciudad;
	private Integer estado;
	private static long total  = 0;
	
	public Usuarios(String nombre, String apellido, String telefono, String password,String calle, String numero, Integer cp, String colonia, String ciudad, Integer estado) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.password = password;
		this.calle = calle;
		this.numero = numero;
		this.cp = cp;
		this.colonia = colonia;
		this.ciudad = ciudad;
		this.estado = estado;
		Usuarios.total++;
		this.id=Usuarios.total;
	}//public Usuario
	
	public Usuarios() {
		Usuarios.total++;
		this.id=Usuarios.total;
	}//public class vacio

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Integer getCp() {
		return cp;
	}

	public void setCp(Integer cp) {
		this.cp = cp;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public Integer getEstado() {
		return estado;
	}

	public void setEstado(Integer estado) {
		this.estado = estado;
	}

	public static long getTotal() {
		return total;
	}

	public static void setTotal(long total) {
		Usuarios.total = total;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono
				+ ", password=" + password + ", calle=" + calle + ", numero=" + numero + ", cp=" + cp + ", colonia="
				+ colonia + ", ciudad=" + ciudad + ", estado=" + estado + "]";
	}//toString

	

	
}//public class "Usuario"
