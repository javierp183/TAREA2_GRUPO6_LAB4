package proyecto;
import java.util.*;


import proyecto.Persona;

//*********************************************************
//					INTEGRANTES
//				1- Javier Pereyra
//				2- Juan Ignacio Corrionero
//				3- Mariano Indaburo
//
//
//         - Ignacio Lacioppa se dio de baja en la materia.
//
//*********************************************************


public class Principal {

	public static void main(String[] args) {
		
		// Lista de tipo Hash Set para
		TreeSet<Persona> listaPersonas = new TreeSet<Persona>();
		
		//instancio la clase Archivo
		Archivo miArchivo = new Archivo();
		miArchivo.setRuta("PersonasEmpresa.txt");
		miArchivo.setRutaguardar("Resultado.txt");
		miArchivo.leeProcesoArchivo(listaPersonas);
		
		
	}

}
