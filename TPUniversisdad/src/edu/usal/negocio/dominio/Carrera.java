package edu.usal.negocio.dominio;

public class Carrera {

	private int id;
	private String nombre;
	private int cantMaterias;
	private int cantAños;

	public Carrera() {

	}

	public Carrera(int id, String nombre, int cantMaterias, int cantAños) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cantMaterias = cantMaterias;
		this.cantAños = cantAños;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantMaterias() {
		return cantMaterias;
	}

	public void setCantMaterias(int cantMaterias) {
		this.cantMaterias = cantMaterias;
	}

	public int getCantAños() {
		return cantAños;
	}

	public void setCantAños(int cantAños) {
		this.cantAños = cantAños;
	}

}
