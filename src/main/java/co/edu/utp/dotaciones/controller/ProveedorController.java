package co.edu.utp.dotaciones.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import co.edu.utp.dotaciones.dto.Proveedor;
import co.edu.utp.dotaciones.services.ProveedorService;

@RestController
public class ProveedorController {
	
	ProveedorService proveedorService;
	
	@PostMapping("/proveedor")
	Proveedor newProveedor(@RequestBody Proveedor proveedor) {
		return proveedorService.insert(proveedor);
	}
	
	
	

}
