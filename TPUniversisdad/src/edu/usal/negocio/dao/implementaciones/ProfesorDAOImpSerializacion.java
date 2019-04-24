package edu.usal.negocio.dao.implementaciones;

import java.io.*;
import java.util.*;

import edu.usal.negocio.dao.interfaces.ProfesorDAO;
import edu.usal.negocio.dominio.Profesor;

public class ProfesorDAOImpSerializacion implements ProfesorDAO {

	@Override
	public void AgregarProfesor(Profesor profesor) throws IOException {

		List<Profesor> profesores = new ArrayList<Profesor>();
		try {
			profesores = GetAll();
		} catch (Exception e) {
			System.out.println(e);
		}

		profesores.add(profesor);

		FileOutputStream archSalida = new FileOutputStream(new File("profesor.dat"));
		ObjectOutputStream ouStream = new ObjectOutputStream(archSalida);

		ouStream.writeObject(profesores);
		ouStream.reset();
		ouStream.close();
	}

	@Override
	public void ModificarProfesor(Profesor profesor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void EliminarProfesor(Profesor profesor) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Profesor> GetAll() throws IOException {
		// TODO Auto-generated method stub

		FileInputStream fileIS = new FileInputStream(new File("profesor.dat"));
		ObjectInputStream oiStream = new ObjectInputStream(fileIS);
		List<Profesor> listadoProfesor = new ArrayList<Profesor>();

		try {
			listadoProfesor = (List<Profesor>) oiStream.readObject();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			oiStream.close();
		}

		return listadoProfesor;
	}

}
