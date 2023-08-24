package com.kotomitl.kotomitl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kotomitl.kotomitl.model.Usuarios;
@Service
public class UsuariosService {

public final ArrayList<Usuarios> lista = new ArrayList<>();
	
	@Autowired
	public UsuariosService() {
		lista.add(new Usuarios("Roberto", "Rivas","25648971","123456","calle el volador","12",54900,"col.san pancho","Ciudad Juarez",25));
		lista.add(new Usuarios("Ignacio", "Rivas","25645471","654321","calle el arrastrado","13",54800,"col.san nacho","Ciudad de méxico",21));
		lista.add(new Usuarios("Bryan", "Rivas","25648572","132465","calle el caminador","14",54700,"col.san judas","Ciudad de méxico",21));
	}
	
	//GET TODAS LAS COMPRAS
	public List<Usuarios> getAllUsuarios(){
		return this.lista;
	}
	
	
	//GET COMPRAS POR SU ID
	public Usuarios getUsuarios(Long id) {
		Usuarios tmp = null;
		for (Usuarios usuarios : lista) {
			if (usuarios.getId().equals(id)) {
				tmp = usuarios;
				break;
			}//if
		}//foreach
		return tmp;
	}
	
	
	//DELETE COMPRAS POR SU ID
	public Usuarios deleteUsuarios(Long id) {
		Usuarios tmp = null;
		for (Usuarios usuarios : lista) {
			if (usuarios.getId().equals(id)) {
				tmp = lista.remove(lista.indexOf(usuarios));
				break;
			}//if
		}//foreach
		return tmp;
	}
	
	//PUT NUEVA COMPRA
	public Usuarios addUsuarios(Usuarios usuarios) {
		lista.add(usuarios);
		return usuarios;
	}
	
	//PUT ACTUALIZAR DATOS DE UNA COMPRA
	public Usuarios updateUsuarios(Long id, String nombre,String apellido,String telefono,String password,String calle,String numero,Integer cp,String colonia,String ciudad,Integer estado) {
		Usuarios tmp = null;
		for (Usuarios usuarios : lista) {
			if (usuarios.getId().equals(id)) {
				if(nombre != null) usuarios.setNombre(nombre);
				if(apellido != null) usuarios.setApellido(apellido);
				if(telefono != null) usuarios.setTelefono(telefono);
				if(password != null) usuarios.setPassword(password);
				if(calle != null) usuarios.setCalle(calle);
				if(cp != null) usuarios.setCp(cp);
				if(colonia != null) usuarios.setColonia(colonia);
				if(ciudad != null) usuarios.setCiudad(ciudad);
				if(estado != null) usuarios.setEstado(estado);
				tmp = usuarios;
				break;
			}//if
		}//foreach
		return tmp;
	}
	
}
