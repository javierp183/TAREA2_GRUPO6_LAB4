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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Apellido == null) ? 0 : Apellido.hashCode());
		result = prime * result + Dni;
		result = prime * result + ((Nombre == null) ? 0 : Nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (Apellido == null) {
			if (other.Apellido != null)
				return false;
		} else if (!Apellido.equals(other.Apellido))
			return false;
		if (Dni != other.Dni)
			return false;
		if (Nombre == null) {
			if (other.Nombre != null)
				return false;
		} else if (!Nombre.equals(other.Nombre))
			return false;
		return true;
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
	
	// Valido DNI y uso la excepcion pedida por la profe.
	public static boolean validarDNI(int dni) throws FaltaDigitoException
	{
		//Valido si el dni tiene 8 digitos
		if(dni == 8) {
			return true;
		}
		
		FaltaDigitoException exc1 = new FaltaDigitoException();
		throw exc1;
		
	}
}
