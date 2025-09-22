package GestionFicheros;

import java.io.File;
import java.io.IOException;

public class EjemploFile {

	public static void main(String[] args) {
		// Creamos un objeto File para representar un fichero
		File fichero = new File("documento.txt");

		// Comprobamos las propiedades de este archivo
		System.out.println("¿Existe? " + fichero.exists());
		System.out.println("¿Es fichero? " + fichero.isFile());
		System.out.println("¿Se puede leer? " + fichero.canRead());

		// Usamos excepciones para ver si existe el archivo, y sino lo creaoms.
		try {
			if (fichero.createNewFile()) {
				System.out.println("Fichero creado correctamente.");
			} else {
				System.out.println("El fichero ya existía.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Mostrar nombre del fichero
		System.out.println("Nombre: " + fichero.getName());
	}

}
