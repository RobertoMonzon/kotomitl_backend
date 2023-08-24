package com.kotomitl.kotomitl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kotomitl.kotomitl.model.ProductosEspecificos;
import com.kotomitl.kotomitl.service.ProductosEspecificosService;

@RestController
@RequestMapping("/api/productosEspecificos/")
public class ProductosEspecificosController {

	private final ProductosEspecificosService varProductosEspecificosService;

	@Autowired
	public ProductosEspecificosController(ProductosEspecificosService productosEspecificosService) {
		this.varProductosEspecificosService = productosEspecificosService;
	}

	// GET ALL productosEspecificos
	@GetMapping
	public List<ProductosEspecificos> getAllProductosEspecificos() {
		return varProductosEspecificosService.getAllProductosEspecificos();
	}

	// GET productosEspecificos POR SU ID
	@GetMapping(path = "{productoEspecificoId}")
	public ProductosEspecificos getProductosEspecificos(@PathVariable("productoEspecificoId") Long id) {
		return varProductosEspecificosService.getProductosEspecificos(id);
	}

	// DELETE productosEspecificos POR SU ID
	@DeleteMapping(path = "{productoEspecificoId}")
	public ProductosEspecificos deleteProductosEspecificos(@PathVariable("productoEspecificoId") Long id) {
		return varProductosEspecificosService.deleteProductosEspecificos(id);
	}

	// POST AGREGAR productosEspecificos
	/*
	 {
    "precio": 1000.0,
    "cantidadStock": 88,
    "imagen": "productoEspecifico89.png",
    "talla": 3,
    "publico": 2,
    "colores": 9
	}
	 */
	@PostMapping
	public ProductosEspecificos addProductosEspecificos(@RequestBody ProductosEspecificos productosEspecificos) {
		return varProductosEspecificosService.addProductosEspecificos(productosEspecificos);
	}

	// PUT ACTUALIZAR productosEspecificos POR SU ID
	@PutMapping(path = "{productoEspecificoId}")
	public ProductosEspecificos updateProductosEspecificos(@PathVariable ("productoEspecificoId") Long id,
			@RequestParam(required = false) Double precio,
			@RequestParam(required = false) Integer cantidadStock,
			@RequestParam(required = false) String imagen,
			@RequestParam(required = false) Integer talla,
			@RequestParam(required = false) Integer publico,
			@RequestParam(required = false) Integer colores) {
		return varProductosEspecificosService.updateProductosEspecificos(id, precio, cantidadStock, imagen,talla,publico,colores);		
	}

}
