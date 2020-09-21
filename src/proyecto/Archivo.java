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
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Archivo {
	
	private String rutaleer;
	private String rutaguardar;
	
	
	public void leeProcesoArchivo(TreeSet<Persona> listaPersonas)
	{
	
	// Leer el archivo llamado Personas Empresa.txt
	FileReader entrada;
	String[] contenido=null;
	String linea="";
	try {
		entrada = new FileReader(rutaleer);
		BufferedReader miBuffer = new BufferedReader(entrada);
		//ArrayList<Persona> auxPersonas = new ArrayList<Persona>();
		TreeSet<Persona> listaPersonas1 = new TreeSet<Persona>();

		   //String linea = "";
			while (linea != null) {
				
				contenido=linea.split("\\n-");

				for(int i=0; i < contenido.length; i++) {
					if(contenido[i] != "") {
					Persona persona = new Persona();
					persona.setNombre(contenido[i].split("-")[0]);
					persona.setApellido(contenido[i].split("-")[1]);
					
					
					try {
						// Solo resguardo las personas que tienen dni con 8 digitos usando
						// un try personalizado
						int castnumdni = Integer.parseInt(contenido[i].split("-")[2]);
						persona.validarDNI(contenido[i].split("-")[2].length());
						persona.setDni(castnumdni);
						listaPersonas1.add(persona);
					
					} catch (FaltaDigitoException e) {
						
					}
					
					}
				}
				
				linea = miBuffer.readLine();
			}
												
			miBuffer.close();
			entrada.close();
			
			escribeArchivoprocesado(listaPersonas1);

	} catch (IOException e) {
		System.out.println("No se encontro el archivo");
	}
	
	

	}
	
	public void escribeArchivoprocesado(TreeSet<Persona> listaPersonas)
	{
		
		try 
		{	
		String rutadondeguardo = "salida.txt";
		FileWriter entradaguardo = new FileWriter(rutadondeguardo, true);
		BufferedWriter miBuffer = new BufferedWriter(entradaguardo);
		
		

		
		for (Persona item : listaPersonas) {
			System.out.println(item.getNombre() + "-" + item.getApellido() + "-" + item.getDni() + "\n");
			miBuffer.write(item.getNombre() + "-" + item.getApellido() + "-" + item.getDni() + "\n");
		}
		
		miBuffer.close();
		entradaguardo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	//Getter and setter
	public String getRuta() {
		return rutaleer;
	}

	public void setRuta(String ruta) {
		this.rutaleer = ruta;
	}

	public String getRutaguardar() {
		return rutaguardar;
	}

	public void setRutaguardar(String rutaguardar) {
		this.rutaguardar = rutaguardar;
	}

}
