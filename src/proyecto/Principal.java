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
			ArrayList<String> aux = new ArrayList<String>();
	
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
				
				miBuffer.close();
				entrada.close();

		} catch (IOException e) {
			System.out.println("No se encontro el archivo");
		}
		
		for(int i=0; i< listaPersonas.size(); i++)
		{
			System.out.println(listaPersonas.get(i).getNombre());
			System.out.println(listaPersonas.get(i).getApellido());
			System.out.println(listaPersonas.get(i).getDni());
		}
	
		//Guarda la datos de la lista
		try 
		{	
		String rutadondeguardo = "salida.txt";
		FileWriter entradaguardo = new FileWriter(rutadondeguardo, true);
		BufferedWriter miBuffer = new BufferedWriter(entradaguardo);
		miBuffer.write("Guardo lista procesada aqui");
		miBuffer.close();
		entradaguardo.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
