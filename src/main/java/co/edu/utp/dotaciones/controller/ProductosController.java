package co.edu.utp.dotaciones.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.utp.dotaciones.dto.Productos;
import co.edu.utp.dotaciones.services.ProductosService;

@RestController
public class ProductosController {
	
	ProductosService productosService;
	
	@PostMapping("/productos")
	Productos newProducto(@RequestBody Productos productos) {
		return productosService.insert(productos);
	}
	
	

}
