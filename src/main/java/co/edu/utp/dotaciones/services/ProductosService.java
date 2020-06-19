package co.edu.utp.dotaciones.services;

import co.edu.utp.dotaciones.dto.Productos;

public interface ProductosService {
	
	Productos insert(Productos productos);
	Boolean delete(String id);
	Boolean update(String id);
	Productos search(String id);
	

}
