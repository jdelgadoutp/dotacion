package co.edu.utp.dotaciones.services;

import co.edu.utp.dotaciones.dto.Proveedor;

public interface ProveedorService {

	Proveedor insert(Proveedor proveedor);
	Boolean delete(String id);
	Boolean update(String id);
	Proveedor search(String id); 
}
