package co.edu.utp.dotaciones.model.entity;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Productos {

	@Id
	@Column(name = "codigo", length = 15)
	private String codigo;

	@Column(name = "barras", length = 15)
	private String barras;

	@Column(name = "nombre", length = 100)
	private String nombre;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categoria_fk")
	private String categoria;

	@Column(name = "costo")
	private float costo;

	@Column(name = "talla")
	private String talla;

	@Column(name = "dias_reposicion")
	private int dias_reposicion;

	@JoinTable(
	        name = "productosxproveedor",
	        joinColumns = @JoinColumn(name = "fk_producto", nullable = false),
	        inverseJoinColumns = @JoinColumn(name="fk_proveedor", nullable = false)
	    )
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Proveedor> proveedor = new ArrayList<>();

	public List<Proveedor> getProveedor() {
		return proveedor;
	}

	public void setProveedor(List<Proveedor> proveedor) {
		this.proveedor = proveedor;
	}

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

}
