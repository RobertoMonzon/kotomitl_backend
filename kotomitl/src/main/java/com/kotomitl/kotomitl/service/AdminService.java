package com.kotomitl.kotomitl.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kotomitl.kotomitl.model.Admin;


//Indica que es un servicio
@Service
public class AdminService {
	
	public final ArrayList<Admin> lista = new ArrayList<>();
	
	//Generar constructor para inicializarlo
	@Autowired
	public AdminService() {
		//Generar una lista default mientras hacemos la conexion a la DB
				lista.add(new Admin("Administrador 1", "admin1@kotomitl.com", "Pa$$w0rd"));
				lista.add(new Admin("Administrador 2", "admin2@kotomitl.com", "Pa$$w0rdddd"));
				lista.add(new Admin("Administrador 3", "admin3@kotomitl.com", "Pa$$w0rddddddddddddddd"));
	}
	
	
	//GET para regresar la lista de los administradores
	//http://localhost:8080/api/admins/
	public List<Admin> getAllAdmins(){
		return this.lista;
	}//getAllAdmins
	
	
	//GET Admin por su id
	//http://localhost:8080/api/admins/2
	public Admin getAdmin(Long id) {
		Admin tmp = null;
		for (Admin admin : lista) {
			if (admin.getId().equals(id)) {
				tmp = admin;
				break;
			}//if
		}//foreach
		return tmp;
	}


	//DELETE eliminar admin por su id
	//http://localhost:8080/api/admins/2
	public Admin deleteAdmin(Long id) {
		Admin tmp = null;
		for (Admin admin : lista) {
			if (admin.getId().equals(id)) {
				tmp = lista.remove(lista.indexOf(admin));
				break;
			}//if
		}//foreach
		return tmp;
	}

	//POST agregar admin
	/* http://localhost:8080/api/admins/
	  Usar en Body -> raw
	  
	 {
        "nombre": "Administrador 4",
        "email": "admin4@kotomitl.com",
        "password": "Pa$$w000000000rdddd"
    }
    
	 */
	public Admin addAdmin(Admin admin) {
		lista.add(admin);
		return admin;
	}
	
	
	//PUT actualizar datos
	//http://localhost:8080/api/admins/3
	//En Params
	//Key(Nombre de la variable a cambiar)    Value(Nuevo valor a asignar)
	// nombre									admin8
	//http://localhost:8080/api/admins/3?nombre=admin8
	public Admin updateAdmin(Long id, String nombre, String email, String password) {
		Admin tmp = null;
		for (Admin admin : lista) {
			if (admin.getId().equals(id)) {
				if(nombre != null) admin.setNombre(nombre);
				if(email != null) admin.setEmail(email);
				if(password != null) admin.setPassword(password);
				tmp = admin;
				break;
			}//if
		}//foreach
		return tmp;
	}
	
		
	
}//getAdmin por su id
