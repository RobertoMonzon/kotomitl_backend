package com.kotomitl.kotomitl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kotomitl.kotomitl.model.ProductosGenerales;

@Service
public class ProductosGeneralesService {
	
public final ArrayList<ProductosGenerales> lista = new ArrayList<>();
	
	@Autowired
	public ProductosGeneralesService() {
		lista.add(new ProductosGenerales("Guayabera", "Maya","100% Algodon","Lavar a mano","Fabricada en taller familiar","Bonita Guayabera Maya en varios colores"));
		lista.add(new ProductosGenerales("Sandalias", "Olmeca","100% Cuero","Limpiar solamente con agua","Fabricada por mujeres","Bonitas sandalias Olmecas en varios colores"));
		lista.add(new ProductosGenerales("Pulsera", "Maya","100% Cuero","Limpiar con un trapo mojado","Fabricada en el taller de la comunidad","Bonita pulsera Maya en varios colores"));

	}
	
	//GET TODOS LOS UN PRODUCTOS GENERALES
		public List<ProductosGenerales> getAllProductosGenerales(){
			return this.lista;
		}
		
		
		//GET UN PRODUCTO GENERAL POR SU ID
		public ProductosGenerales getProductosGenerales(Long id) {
			ProductosGenerales tmp = null;
			for (ProductosGenerales productosGenerales : lista) {
				if (productosGenerales.getId().equals(id)) {
					tmp = productosGenerales;
					break;
				}//if
			}//foreach
			return tmp;
		}
		
		
		//DELETE UN PRODUCTO GENERAL POR SU ID
		public ProductosGenerales deleteProductosGenerales(Long id) {
			ProductosGenerales tmp = null;
			for (ProductosGenerales productosGenerales : lista) {
				if (productosGenerales.getId().equals(id)) {
					tmp = lista.remove(lista.indexOf(productosGenerales));
					break;
				}//if
			}//foreach
			return tmp;
		}
		
		//PUT NUEVO PRODUCTO GENERAL
		public ProductosGenerales addProductosGenerales(ProductosGenerales productosGenerales) {
			lista.add(productosGenerales);
			return productosGenerales;
		}
		
		//PUT ACTUALIZAR DATOS DE UN PRODUCTO GENERAL
		public ProductosGenerales updateProductosGenerales(Long id, String nombre, String origen, String materiales, String sugerencia, String adicional, String descripcion) {
			ProductosGenerales tmp = null;
			for (ProductosGenerales productosGenerales : lista) {
				if (productosGenerales.getId().equals(id)) {
					if(nombre != null) productosGenerales.setNombre(nombre);
					if(origen != null) productosGenerales.setOrigen(origen);
					if(materiales != null) productosGenerales.setMateriales(materiales);
					if(sugerencia != null) productosGenerales.setSugerencia(sugerencia);
					if(adicional != null) productosGenerales.setAdicional(adicional);
					if(descripcion != null) productosGenerales.setDescripcion(descripcion);
					tmp = productosGenerales;
					break;
				}//if
			}//foreach
			return tmp;
		}
	

}
