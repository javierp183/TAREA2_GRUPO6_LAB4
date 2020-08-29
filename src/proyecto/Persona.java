package proyecto;

public class Persona {

	private int dni;
	private String nombre;
	private String apellido;
	
	//gets y sets
	public int getDni() {
		return dni;
	}
	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	// constructores
	
	public Persona() {
		dni=11111111;
		nombre = "Sin Nombre";
		apellido = "Sin Apellido";
	}
	
	public Persona(String nombre, String apellido, int dni) {
		setNombre(nombre);
		setApellido(apellido);
		setDni(dni);
	}
}
