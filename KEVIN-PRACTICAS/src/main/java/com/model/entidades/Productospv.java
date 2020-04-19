package com.model.entidades;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the productospv database table.
 * 
 */
@Entity
@NamedQuery(name="Productospv.findAll", query="SELECT p FROM Productospv p")
public class Productospv implements Serializable {
	private static final long serialVersionUID = 1L;

	private int cantidadProducto;
    @Id
	private int id;

	private String nombreProducto;

	private double precioProducto;

	private double totalProducto;

	public Productospv() {
	}

	public int getCantidadProducto() {
		return this.cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreProducto() {
		return this.nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public double getPrecioProducto() {
		return this.precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public double getTotalProducto() {
		return this.totalProducto;
	}

	public void setTotalProducto(double totalProducto) {
		this.totalProducto = totalProducto;
	}

}