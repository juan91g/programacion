package edu.usal.negocio.dominio;

import java.util.*;

public class Profesor extends Empleado {

	private double sueldo;
	private List<Catedra> catedras = new ArrayList<Catedra>();

	public Profesor() {

	}

	public Profesor(int id, String nombre, String apellido, String dni, String direccion, double sueldo, Pabellon pab,
			List<Catedra> catedras) {
		super(id, nombre, apellido, dni, direccion);
		this.sueldo = sueldo;
		this.catedras = catedras;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public List<Catedra> getCatedras() {
		return catedras;
	}

	public void setCatedras(int id, String nombre, String tamaño, int cantMesas, TipoPizarron tipoPizarron) {

		catedras.add(new Catedra(id, nombre, tamaño, cantMesas, tipoPizarron));

	}

}
