package proyecto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		
		// Leer el archivo llamado Personas Empresa.txt
		
		// defino ruta
		String ruta = "PersonasEmpresas.txt";
		FileReader entrada;
		try {
			entrada = new FileReader(ruta);
			BufferedReader miBuffer = new BufferedReader(entrada);
			
		   String linea = "";
			while (linea != null) {
				System.out.println(linea);
				linea = miBuffer.readLine();
			}
			miBuffer.close();
			entrada.close();

		} catch (IOException e) {
			System.out.println("No se encontro el archivo");
		}
		
		
		
		
	}

}
