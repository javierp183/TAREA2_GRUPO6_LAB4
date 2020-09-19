package proyecto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;


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
		HashSet<Persona> listaPersonas = new HashSet<Persona>();
		
		//instancio la clase Archivo
		Archivo miArchivo = new Archivo();
		miArchivo.setRuta("PersonasEmpresa.txt");
		miArchivo.setRutaguardar("salida.txt");
		miArchivo.leeProcesoArchivo(listaPersonas);
		miArchivo.escribeArchivoprocesado(listaPersonas);
		
		
	}

}
