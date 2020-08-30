package proyecto;

public class Persona {

	private int Dni;
	private String Nombre;
	private String Apellido;
	
	//gets y sets
	public int getDni() {
		return Dni;
	}
	public void setDni(int dni) {
		this.Dni = dni;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}
	public String getApellido() {
		return Apellido;
	}
	public void setApellido(String apellido) {
		this.Apellido = apellido;
	}
	
	// Constructors
	
	public Persona() {
		Dni=11111111;
		Nombre = "Sin Nombre";
		Apellido = "Sin Apellido";
	}
	
	public Persona(String nombre, String apellido, int dni) {
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.Dni = dni;;
	}

	@Override
    public String toString() {
        return "Apellido: " + this.Apellido + " " + "Nombre: " + this.Nombre + " " + "Dni: " + this.Dni;
    }
}
