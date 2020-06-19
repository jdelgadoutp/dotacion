package co.edu.utp.dotaciones.dto;

import java.util.ArrayList;
import java.util.List;

import co.edu.utp.dotaciones.model.entity.Productos;

public class Categoria {

	private String id;
	private String nombre;
	private String descripcion;
	private List<Productos> productos = new ArrayList<>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Productos> getProductos() {
		return productos;
	}

	public void setProductos(List<Productos> productos) {
		this.productos = productos;
	}

}
