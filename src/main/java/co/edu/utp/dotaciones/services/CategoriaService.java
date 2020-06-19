package co.edu.utp.dotaciones.services;

import co.edu.utp.dotaciones.dto.Categoria;

public interface CategoriaService {
	
	Categoria insert(Categoria categoria);
	Boolean delete(String id);
	Boolean update(String id);
	Categoria search(String id);

}
