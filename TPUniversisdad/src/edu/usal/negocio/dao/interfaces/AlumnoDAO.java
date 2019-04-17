package edu.usal.negocio.dao.interfaces;

import java.io.*;
import java.util.*;

import edu.usal.negocio.dominio.Alumno;

public interface AlumnoDAO {

	void AgregarProfesor(Alumno alumno) throws IOException;

	void ModificarProfesor(Alumno alumno);

	void EliminarProfesor(Alumno alumno);

	List<Alumno> GetAll() throws IOException;

}
