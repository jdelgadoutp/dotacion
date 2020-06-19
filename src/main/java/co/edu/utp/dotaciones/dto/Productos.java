package co.edu.utp.dotaciones.dto;

import java.util.ArrayList;
import java.util.List;

import co.edu.utp.dotaciones.model.entity.Proveedor;

public class Productos {

	private String codigo;
	private String barras;
	private String nombre;
	private String categoria;
	private float costo;
	private String talla;
	private int dias_reposicion;
	private List<Proveedor> proveedor = new ArrayList<>();

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getBarras() {
		return barras;
	}

	public void setBarras(String barras) {
		this.barras = barras;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	public int getDias_reposicion() {
		return dias_reposicion;
	}

	public void setDias_reposicion(int dias_reposicion) {
		this.dias_reposicion = dias_reposicion;
	}

	public List<Proveedor> getProveedor() {
		return proveedor;
	}

	public void setProveedor(List<Proveedor> proveedor) {
		this.proveedor = proveedor;
	}

}
