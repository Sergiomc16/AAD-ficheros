package modelo;

public class InvalidFormatException extends IllegalArgumentException {
    public InvalidFormatException(String mensaje) {
        super("Error: " + mensaje);
    }
}