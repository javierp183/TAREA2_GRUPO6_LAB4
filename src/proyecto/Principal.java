package proyecto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {

		// Lista de Personas
		ArrayList<String> elementos = new ArrayList<String>();

		// Leer el archivo llamado Personas Empresa.txt
		String ruta = "PersonasEmpresa.txt ";
		FileReader entrada;
		try {
			entrada = new FileReader(ruta);
			BufferedReader miBuffer = new BufferedReader(entrada);
			ArrayList<String> aux = new ArrayList<String>();
	
			   String linea = "";
				while (linea != null) {
					
					String[] contenido = linea.split("-");
					
					for(String cl: contenido) {
						aux.add(cl);
					}
					
					
					linea = miBuffer.readLine();
				}
				System.out.println(aux);
				
				miBuffer.close();
				entrada.close();

		} catch (IOException e) {
			System.out.println("No se encontro el archivo");
		}
		
		
		
		
	}

}
