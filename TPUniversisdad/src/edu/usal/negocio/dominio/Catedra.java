package edu.usal.negocio.dominio;

public class Catedra {

	private int id;
	private String nombre;
	private String tamaño;
	private int cantMesas;
	private TipoPizarron tipoPizarron;

	public Catedra() {

	}

	public Catedra(int id, String nombre, String tamaño, int cantMesas, TipoPizarron tipoPizarron) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tamaño = tamaño;
		this.cantMesas = cantMesas;
		this.tipoPizarron = tipoPizarron;
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

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}

	public int getCantMesas() {
		return cantMesas;
	}

	public void setCantMesas(int cantMesas) {
		this.cantMesas = cantMesas;
	}

	public TipoPizarron getTipoPizarron() {
		return tipoPizarron;
	}

	public void setTipoPizarron(TipoPizarron tipoPizarron) {
		this.tipoPizarron = tipoPizarron;
	}

}
