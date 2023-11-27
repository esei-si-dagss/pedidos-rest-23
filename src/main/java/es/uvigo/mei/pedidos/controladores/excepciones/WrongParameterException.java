package es.uvigo.mei.pedidos.controladores.excepciones;

public class WrongParameterException extends RuntimeException {
    public WrongParameterException(String message) {
        super(message);
    }
}