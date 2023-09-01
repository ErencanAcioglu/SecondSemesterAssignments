

	//Erencan Acıoğlu 150122056
	//IllegalNameException class extends Exception class. 
	//This exception will be thrown when the user tries to add an animal with an existing name.
public class IllegalNameException extends Exception {
    public IllegalNameException(String message) {
        super(message);
    }
}
