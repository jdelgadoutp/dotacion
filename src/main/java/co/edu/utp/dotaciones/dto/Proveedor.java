package co.edu.utp.dotaciones.dto;

import java.util.ArrayList;
import java.util.List;

import co.edu.utp.dotaciones.model.entity.Productos;

public class Proveedor {

	private String id;
	private String razonsocial;
	private String razoncomercial;
	private String direccion;
	private String ciudad;
	private String telefono;
	private String email;
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
