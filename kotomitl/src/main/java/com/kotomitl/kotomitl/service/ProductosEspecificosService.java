package com.kotomitl.kotomitl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kotomitl.kotomitl.model.ProductosEspecificos;

@Service
public class ProductosEspecificosService {
	
	public final ArrayList<ProductosEspecificos> lista = new ArrayList<>();
	
	@Autowired
	public ProductosEspecificosService() {
		lista.add(new ProductosEspecificos(289.90,50,"productoEspecifico1.png",2,1,5));
		lista.add(new ProductosEspecificos(500.00,32,"productoEspecifico2.png",1,0,8));
		lista.add(new ProductosEspecificos(999.99,18,"productoEspecifico3.png",3,2,6));
	}
	
	//GET TODAS LOS productosEspecificos
		public List<ProductosEspecificos> getAllProductosEspecificos(){
			return this.lista;
		}
		
		
		//GET productosEspecificos POR SU ID
		public ProductosEspecificos getProductosEspecificos(Long id) {
			ProductosEspecificos tmp = null;
			for (ProductosEspecificos productosEspecificos : lista) {
				if (productosEspecificos.getId().equals(id)) {
					tmp = productosEspecificos;
					break;
				}//if
			}//foreach
			return tmp;
		}
		
		
		//DELETE productosEspecificos POR SU ID
		public ProductosEspecificos deleteProductosEspecificos(Long id) {
			ProductosEspecificos tmp = null;
			for (ProductosEspecificos productosEspecificos : lista) {
				if (productosEspecificos.getId().equals(id)) {
					tmp = lista.remove(lista.indexOf(productosEspecificos));
					break;
				}//if
			}//foreach
			return tmp;
		}
		
		//PUT NUEVA productosEspecificos
		public ProductosEspecificos addProductosEspecificos(ProductosEspecificos productosEspecificos) {
			lista.add(productosEspecificos);
			return productosEspecificos;
		}
		
		//PUT ACTUALIZAR DATOS DE UN productosEspecificos
		public ProductosEspecificos updateProductosEspecificos(Long id, Double precio,Integer cantidadStock,  String imagen, Integer talla, Integer publico, Integer colores ) {
			ProductosEspecificos tmp = null;
			for (ProductosEspecificos productosEspecificos : lista) {
				if (productosEspecificos.getId().equals(id)) {
					if(precio != null) productosEspecificos.setPrecio(precio);
					if(cantidadStock != null) productosEspecificos.setCantidadStock(cantidadStock);
					if(imagen != null) productosEspecificos.setImagen(imagen);
					if(talla != null) productosEspecificos.setTalla(talla);
					if(publico != null) productosEspecificos.setPublico(publico);
					if(colores != null) productosEspecificos.setColores(colores);
					tmp = productosEspecificos;
					break;
				}//if
			}//foreach
			return tmp;
		}
}
