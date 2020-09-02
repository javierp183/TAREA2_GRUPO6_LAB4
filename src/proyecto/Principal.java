package proyecto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import ejemplo1_Equals.Persona;

public class Principal {

	public static void main(String[] args) {

		// Lista de Personas
		ArrayList<Persona> listaPersonas = new ArrayList<Persona>();

		String[] contenido=null;
		String linea="";

		// Leer el archivo llamado Personas Empresa.txt
		String ruta = "PersonasEmpresa.txt ";
		FileReader entrada;
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
				
				//Eliminamos duplicado
				for(Persona element: listaPersonas) {
					if(!auxPersonas.contains(element)) {
						auxPersonas.add(element);
					}
				}
				
				System.out.println(auxPersonas);
				
				listaPersonas = auxPersonas;
				
				System.out.println(listaPersonas);
				
				
				miBuffer.close();
				entrada.close();

		} catch (IOException e) {
			System.out.println("No se encontro el archivo");
		}
		


		
	
		//Guarda la datos de la lista
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

}
