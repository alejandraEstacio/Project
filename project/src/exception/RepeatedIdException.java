package exception;

public class RepeatedIdException extends Exception {

	public RepeatedIdException(int id) {
		
		super("El id ya existe ");
	}
}
