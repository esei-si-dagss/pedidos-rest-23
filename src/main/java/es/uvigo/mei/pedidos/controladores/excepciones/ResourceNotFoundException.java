package es.uvigo.mei.pedidos.controladores.excepciones;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }
}