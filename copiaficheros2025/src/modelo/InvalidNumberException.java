package modelo;

public class InvalidNumberException extends IllegalArgumentException {
    public InvalidNumberException(String mensaje) {
        super("Error: " + mensaje);
    }
}
