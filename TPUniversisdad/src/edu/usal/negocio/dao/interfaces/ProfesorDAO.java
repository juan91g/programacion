package edu.usal.negocio.dao.interfaces;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import edu.usal.negocio.dominio.Profesor;

public interface ProfesorDAO {

	void AgregarProfesor(Profesor profesor) throws IOException;

	void ModificarProfesor(Profesor profesor);

	void EliminarProfesor(Profesor profesor);

	List<Profesor> GetAll() throws IOException;

}
