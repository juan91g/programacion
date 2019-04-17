package edu.usal.negocio.dominio;

import java.util.*;

public class Pabellon {

	private int id;
	private String tamaño;
	private String direccion;
	private String nombre;
	private List<Catedra> catedras = new ArrayList<Catedra>();

	public Pabellon() {

	}

	public Pabellon(int id, String tamaño, String direccion, String nombre, List<Catedra> catedras) {
		super();
		this.id = id;
		this.tamaño = tamaño;
		this.direccion = direccion;
		this.nombre = nombre;
		this.catedras = catedras;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Catedra> getCatedras() {
		return catedras;
	}

	public void setCatedras(int id, String nombre, String tamaño, int cantMesas, TipoPizarron tipoPizarron) {

		catedras.add(new Catedra(id, nombre, tamaño, cantMesas, tipoPizarron));

	}

}
