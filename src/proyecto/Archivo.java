package proyecto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Archivo {
	
	private String ruta;
	
	public void leeArchivo(ArrayList<Persona> listaPersonas)
	{
	
	// Leer el archivo llamado Personas Empresa.txt
	FileReader entrada;
	
	String[] contenido=null;
	String linea="";
	try {
		entrada = new FileReader(ruta);
		BufferedReader miBuffer = new BufferedReader(entrada);
		ArrayList<Persona> auxPersonas = new ArrayList<Persona>();

		   //String linea = "";
			while (linea != null) {
				
				contenido=linea.split("\\n-");

				for(int i=0; i < contenido.length; i++) {
					if(contenido[i] != "") {
					Persona persona = new Persona();
					persona.setNombre(contenido[i].split("-")[0]);
					persona.setApellido(contenido[i].split("-")[1]);
					int castnumdni = Integer.parseInt(contenido[i].split("-")[2]);

					if(contenido[i].split("-")[2].length() == 8) {
						persona.setDni(castnumdni);
						listaPersonas.add(persona);
					}
					
					}
				}
				
				linea = miBuffer.readLine();
			}
			System.out.println(listaPersonas);
			
			//Eliminamos duplicado con hash implementado en Persona.
			for(Persona element: listaPersonas) {
				if(!auxPersonas.contains(element)) {
					auxPersonas.add(element);
				}
			}
		
			
			//System.out.println(auxPersonas);
			
			listaPersonas = auxPersonas;
			
			//System.out.println(listaPersonas);
			
			///Lista ordenada por Nombre de Z-A
			Collections.sort(listaPersonas, new Comparator<Persona>() {
				public int compare(Persona p1, Persona p2) {
					return Integer.valueOf(p2.getNombre().compareTo(p1.getNombre()));
				}
			});
			
			System.out.println(listaPersonas);
	
			
			
			miBuffer.close();
			entrada.close();

	} catch (IOException e) {
		System.out.println("No se encontro el archivo");
	}
	
	

	}
	
	public void escribeArchivo(ArrayList<Persona> listaPersonas)
	{
		
		try 
		{	
		String rutadondeguardo = "salida.txt";
		FileWriter entradaguardo = new FileWriter(rutadondeguardo, true);
		BufferedWriter miBuffer = new BufferedWriter(entradaguardo);
		for(int i=0; i< listaPersonas.size(); i++)
		{
			Persona persona = new Persona();
			persona.setNombre(listaPersonas.get(i).getNombre());
			persona.setApellido(listaPersonas.get(i).getApellido());
			persona.setDni(listaPersonas.get(i).getDni());
			System.out.println(persona.getNombre() + "-" + persona.getApellido() + "-" + persona.getDni());
			
		miBuffer.write(persona.getNombre() + "-" + persona.getApellido() + "-" + persona.getDni() + "\n");
		}
		miBuffer.close();
		entradaguardo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//Getter and setter
	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

}