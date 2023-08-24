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

import com.kotomitl.kotomitl.model.Compras;
import com.kotomitl.kotomitl.service.ComprasService;

@RestController
@RequestMapping("/api/compras/")
public class ComprasController {
	
	private final ComprasService varComprasService;
	
	@Autowired
	public ComprasController(ComprasService comprasService) {
		this.varComprasService = comprasService;
	}
	
	//GET ALL SHOPPING
	@GetMapping
	public List<Compras> getAllCompras(){
		return varComprasService.getAllCompras();
	}
	
	//GET COMPRA POR SU ID
	@GetMapping(path = "{compraId}")
	public Compras getCompras(@PathVariable ("compraId") Long id) {
		return varComprasService.getCompras(id);
	}
	
	//DELETE COMPRA POR SU ID
	@DeleteMapping(path = "{compraId}")
	public Compras deleteCompras(@PathVariable("compraId") Long id) {
		return varComprasService.deleteCompras(id);
	}
	
	
	//POST AGREGAR COMPRAS
	/*
	 {
        "cantidadTotal": 12,
        "direccion": "Calle La Calandria",
        "precioTotal": 2589.99
    } 

	 * */
	@PostMapping
	public Compras addCompras(@RequestBody Compras compras) {
		return varComprasService.addCompras(compras);
	}
	
	
	//PUT ACTUALIZAR COMPRA POR SU ID
	@PutMapping(path = "{compraId}")
	public Compras updateCompras(@PathVariable ("compraId") Long id,
			@RequestParam(required = false) Integer cantidadTotal,
			@RequestParam(required = false) String direccion,
			@RequestParam(required = false) Double precioTotal) {
		return varComprasService.updateCompras(id, cantidadTotal, direccion, precioTotal);		
	}
	

}
