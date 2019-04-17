package edu.usal.negocio.dao.implementaciones;

import java.io.*;
import java.util.*;

import edu.usal.negocio.dao.interfaces.ProfesorDAO;
import edu.usal.negocio.dominio.Profesor;

public class ProfesorDAOImplArchivo implements ProfesorDAO {

	private File archivo;
	private FileWriter archivoWriter;
	private FileReader archivoReader;
	private BufferedWriter archivoBufferWriter;
	private BufferedReader archivoBufferReader;

	@Override
	public void AgregarProfesor(Profesor profesor) throws IOException {

		archivo = new File("profesor.txt");
		archivoWriter = new FileWriter(archivo);
		archivoBufferWriter = new BufferedWriter(archivoWriter);

		String str = SaveProfesor(profesor);

		archivoBufferWriter.write(str);
		archivoBufferWriter.close();
		archivoWriter.close();

	}

	private String SaveProfesor(Profesor profesor) {

		return profesor.getApellido() + ";" + profesor.getNombre() + "\n";

	}

	private Profesor ParseProfesor(String linea) {

		String[] atributos = linea.split(";");

		Profesor profesor = new Profesor();
		profesor.setApellido(atributos[0]);
		profesor.setNombre(atributos[1]);

		return profesor;
	}

	@Override
	public void ModificarProfesor(Profesor profesor) {

	}

	@Override
	public void EliminarProfesor(Profesor profesor) {

	}

	@Override
	public List<Profesor> GetAll() throws IOException {

		archivo = new File("profesor.txt");
		archivoReader = new FileReader(archivo);
		archivoBufferReader = new BufferedReader(archivoReader);

		String linea;
		List<Profesor> listadoProfesor = new ArrayList<Profesor>();

		while ((linea = archivoBufferReader.readLine()) != null) {

			listadoProfesor.add(ParseProfesor(linea));

		}

		return listadoProfesor;
	}

}
