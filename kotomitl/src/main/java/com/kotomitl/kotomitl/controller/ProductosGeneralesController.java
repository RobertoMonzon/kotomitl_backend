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

import com.kotomitl.kotomitl.model.ProductosGenerales;
import com.kotomitl.kotomitl.service.ProductosGeneralesService;




@RestController
@RequestMapping("/api/productosGenerales/")
public class ProductosGeneralesController {

	private final ProductosGeneralesService varProductosGeneralesService;

	@Autowired
	public ProductosGeneralesController(ProductosGeneralesService productosGeneralesService) {
		this.varProductosGeneralesService = productosGeneralesService;
	}
	
	// GET ALL productosGenerales
	@GetMapping
	public List<ProductosGenerales> getAllProductosGenerales() {
		return varProductosGeneralesService.getAllProductosGenerales();
	}

	// GET productosGenerales POR SU ID
	@GetMapping(path = "{productoGeneralId}")
	public ProductosGenerales getProductosGenerales(@PathVariable("productoGeneralId") Long id) {
		return varProductosGeneralesService.getProductosGenerales(id);
	}
	
	// DELETE productosGenerales POR SU ID
	@DeleteMapping(path = "{productoGeneralId}")
	public ProductosGenerales deleteProductosGenerales(@PathVariable("productoGeneralId") Long id) {
		return varProductosGeneralesService.deleteProductosGenerales(id);
	}

	// POST AGREGAR productosGenerales
	/*
	 {
    "nombre": "Sandaliassssssss",
    "origen": "Olmecaaaaaaaa",
    "materiales": "100% Cuerooooooo",
    "surgerencia": "Limpiar solamente con aguaaaaaaa",
    "adicional": "Fabricada por mujeressssssss",
    "descripcion": "Bonitas sandalias Olmecas en varios coloressssssssss"
	}
	 */
	@PostMapping
	public ProductosGenerales addProductosGenerales(@RequestBody ProductosGenerales productosGenerales) {
		return varProductosGeneralesService.addProductosGenerales(productosGenerales);
	}

	// PUT ACTUALIZAR productosGenerales POR SU ID
	@PutMapping(path = "{productoGeneralId}")
	public ProductosGenerales updateProductosGenerales(@PathVariable ("productoGeneralId") Long id,
			@RequestParam(required = false) String nombre,
			@RequestParam(required = false) String origen,
			@RequestParam(required = false) String materiales,
			@RequestParam(required = false) String surgerencia,
			@RequestParam(required = false) String adicional,
			@RequestParam(required = false) String descripcion) {
		return varProductosGeneralesService.updateProductosGenerales(id, nombre, origen, materiales,surgerencia,adicional,descripcion);		
	}

}
