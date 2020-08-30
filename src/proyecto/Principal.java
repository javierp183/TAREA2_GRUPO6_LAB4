package proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Principal {

	private static String route = "/PersonasEmpresa.txt";

	public static void main(String[] args) {
		
		File archive = new File(route);
		if(archive.exists()){

		}
		
	}

	public void lee_lineas() {
        FileReader entrada;
        try {
            entrada = new FileReader(route);
            BufferedReader miBuffer = new BufferedReader(entrada);
            
            ArrayList<Persona> PersonaList = new ArrayList<Persona>();
            
           String linea = "";
            while (linea != null) {
                System.out.println(linea);
               // PersonaList.add(); 
                
                linea = miBuffer.readLine();
            }
            miBuffer.close();
            entrada.close();

        } catch (IOException e) {
            System.out.println("No se encontro el archivo");
        }
    }

}
