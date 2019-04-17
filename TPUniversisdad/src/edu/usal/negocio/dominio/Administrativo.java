package edu.usal.negocio.dominio;

public class Administrativo extends Empleado {

	private double sueldo;
	private Pabellon pabellon;

	public Administrativo() {

	}

	public Administrativo(int id, String nombre, String apellido, String dni, String direccion, double sueldo,
			Pabellon pabellon) {
		super(id, nombre, apellido, dni, direccion);
		this.sueldo = sueldo;
		this.pabellon = pabellon;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public Pabellon getPabellon() {
		return pabellon;
	}

	public void setPabellon(Pabellon pabellon) {
		this.pabellon = pabellon;
	}

}
