package edu.usal.negocio.dao.factory;

import edu.usal.negocio.dao.implementaciones.ProfesorDAOImpSerializacion;
import edu.usal.negocio.dao.implementaciones.ProfesorDAOImplArchivo;
import edu.usal.negocio.dao.interfaces.ProfesorDAO;

public class ProfesorFactory {

	public static ProfesorDAO GetImplementation(String source) {

		if (source.equals("Archivo")) {
			return new ProfesorDAOImplArchivo();
		} else if (source.equals("Serializacion")) {
			return new ProfesorDAOImpSerializacion();
		}
		return null;
	}

}
