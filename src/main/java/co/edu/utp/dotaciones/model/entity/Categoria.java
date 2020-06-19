package co.edu.utp.dotaciones.model.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categoria {

	@Id
	@Column(name = "id", length = 10)
	private String id;

	@Column(name = "nombre", length = 100)
	private String nombre;

	@Column(name = "descripcion", length = 200)
	private String descripcion;

	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	private List<Productos> productos = new ArrayList<>();

	public List<Productos> getProductos() {
		return productos;
	}

	public void setProductos(List<Productos> productos) {
		this.productos = productos;
	}

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

}
