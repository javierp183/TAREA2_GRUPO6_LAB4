package proyecto;

public class FaltaDigitoException extends RuntimeException{
	
	public FaltaDigitoException()
	{
		
	}

	@Override
	public String getMessage() {
		return "Este DNI no tiene 8 digitos";
	}

}
