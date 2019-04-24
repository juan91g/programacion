package edu.usal.main;

import edu.usal.negocio.dao.factory.ProfesorFactory;
import edu.usal.negocio.dao.interfaces.ProfesorDAO;
import edu.usal.negocio.dominio.Profesor;

import java.util.*;
import java.io.*;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Profesor profesor1 = new Profesor();
		profesor1.setApellido("lopez");
		profesor1.setNombre("juan");
		profesor1.setDni("3619293");
		profesor1.setDireccion("Santa Fe 1234, CABA");

		ProfesorDAO impDAO = ProfesorFactory.GetImplementation("Serializacion");

		try {
			impDAO.AgregarProfesor(profesor1);
			profesor1.setApellido("Gomez");
			profesor1.setNombre("amigo");
			impDAO.AgregarProfesor(profesor1);

			// List<Profesor> listado = impDAO.GetAll();

			/*
			 * for (Profesor profe : listado) { System.out.println(profe.getApellido() + " "
			 * + profe.getNombre()); }
			 */

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
