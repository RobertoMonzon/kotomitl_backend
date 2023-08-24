package com.kotomitl.kotomitl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kotomitl.kotomitl.model.Compras;

@Service
public class ComprasService {
	
	public final ArrayList<Compras> lista = new ArrayList<>();
	
	@Autowired
	public ComprasService() {
		lista.add(new Compras(1, "Calle La Rielera", 490.99));
		lista.add(new Compras(8, "Calle La Adelita", 1058.56));
		lista.add(new Compras(5, "Calle La Guerrillera", 845.50));
	}
	
	//GET TODAS LAS COMPRAS
	public List<Compras> getAllCompras(){
		return this.lista;
	}
	
	
	//GET COMPRAS POR SU ID
	public Compras getCompras(Long id) {
		Compras tmp = null;
		for (Compras compras : lista) {
			if (compras.getId().equals(id)) {
				tmp = compras;
				break;
			}//if
		}//foreach
		return tmp;
	}
	
	
	//DELETE COMPRAS POR SU ID
	public Compras deleteCompras(Long id) {
		Compras tmp = null;
		for (Compras compras : lista) {
			if (compras.getId().equals(id)) {
				tmp = lista.remove(lista.indexOf(compras));
				break;
			}//if
		}//foreach
		return tmp;
	}
	
	//PUT NUEVA COMPRA
	public Compras addCompras(Compras compras) {
		lista.add(compras);
		return compras;
	}
	
	//PUT ACTUALIZAR DATOS DE UNA COMPRA
	public Compras updateCompras(Long id, Integer cantidadTotal, String direccion, Double precioTotal) {
		Compras tmp = null;
		for (Compras compras : lista) {
			if (compras.getId().equals(id)) {
				if(cantidadTotal != null) compras.setCantidadTotal(cantidadTotal);
				if(direccion != null) compras.setDireccion(direccion);
				if(precioTotal != null) compras.setPrecioTotal(precioTotal);
				tmp = compras;
				break;
			}//if
		}//foreach
		return tmp;
	}
	
	
	
	
}
