package co.edu.utp.dotaciones.model.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Proveedor {
	
	@Id
	@Column(name = "id", length = 30)
	private String id;
	
	@Column(name = "razonsocial",length = 200)
	private String razonsocial;
	
	@Column(name = "razoncomercial",length = 200)
	private String razoncomercial;
	
	@Column(name = "direccion", length = 200)
	private String direccion;
	
	@Column(name = "ciudad", length = 100)
	private String ciudad;
	
	@Column(name = "telefono", length = 20)
	private String telefono;
	
	@Column(name = "email", length = 100)
	private String email;

	@ManyToMany(mappedBy = "proveedor")
	private List<Productos> productos = new ArrayList<>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRazonsocial() {
		return razonsocial;
	}

	public void setRazonsocial(String razonsocial) {
		this.razonsocial = razonsocial;
	}

	public String getRazoncomercial() {
		return razoncomercial;
	}

	public void setRazoncomercial(String razoncomercial) {
		this.razoncomercial = razoncomercial;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Productos> getProductos() {
		return productos;
	}

	public void setProductos(List<Productos> productos) {
		this.productos = productos;
	}

}
