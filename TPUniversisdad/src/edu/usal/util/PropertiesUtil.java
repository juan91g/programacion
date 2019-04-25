package edu.usal.util;

import java.util.*;
import java.io.*;

public class PropertiesUtil {

	private static Properties properties = new Properties();
	private static PropertiesUtil objeto = null;

	private PropertiesUtil() throws FileNotFoundException, IOException {
		properties.load(new FileReader("config.properties"));

	}

	public static PropertiesUtil getInstance() throws FileNotFoundException, IOException {

		if (objeto == null) {
			objeto = new PropertiesUtil();

		}
		return objeto;
	}

	public static String getPropertyProfesor() {

		return properties.getProperty("pathProfesor");

	}

}
