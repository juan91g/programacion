package edu.usal.negocio.dao.implementaciones;

import java.io.*;
import java.util.*;

import edu.usal.negocio.dao.interfaces.AlumnoDAO;
import edu.usal.negocio.dominio.Alumno;
import edu.usal.negocio.dominio.Profesor;

public class AlumnoDAOImplArchivo implements AlumnoDAO {

	private File archivo;
	private FileWriter archivoWriter;
	private FileReader archivoReader;
	private BufferedWriter archivoBufferWriter;
	private BufferedReader archivoBufferReader;

	@Override
	public void AgregarProfesor(Alumno alumno) throws IOException {
		// TODO Auto-generated method stub
		archivo = new File("alumno.txt");
		archivoWriter = new FileWriter(archivo);
		archivoBufferWriter = new BufferedWriter(archivoWriter);

		String str = SaveAlumno(alumno);

		archivoBufferWriter.write(str);
		archivoBufferWriter.close();
		archivoWriter.close();

	}

	private String SaveAlumno(Alumno alumno) {
		// TODO Auto-generated method stub
		return alumno.getApellido() + ";" + alumno.getNombre() + ";" + alumno.getCarrera().getNombre() + "\n";

	}

	@Override
	public void ModificarProfesor(Alumno alumno) {
		// TODO Auto-generated method stub

	}

	@Override
	public void EliminarProfesor(Alumno alumno) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Alumno> GetAll() throws IOException {
		// TODO Auto-generated method stub

		archivo = new File("alumno.txt");
		archivoReader = new FileReader(archivo);
		archivoBufferReader = new BufferedReader(archivoReader);

		String linea;
		List<Alumno> listadoAlumno = new ArrayList<Alumno>();

		while ((linea = archivoBufferReader.readLine()) != null) {

			listadoAlumno.add(ParseAlumno(linea));

		}

		return listadoAlumno;

	}

	private Alumno ParseAlumno(String linea) {

		String[] atributos = linea.split(";");

		Alumno alumno = new Alumno();
		alumno.setApellido(atributos[0]);
		alumno.setNombre(atributos[1]);
		// alumno.setCarrera(atributos[2]);

		return alumno;
	}

}
