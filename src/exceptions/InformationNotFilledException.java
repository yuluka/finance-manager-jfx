package exceptions;

public class InformationNotFilledException extends RuntimeException{

	public InformationNotFilledException() {
		super("No has llenado la informaci�n necesaria para registrar el gasto o ingreso.");
	}

}
