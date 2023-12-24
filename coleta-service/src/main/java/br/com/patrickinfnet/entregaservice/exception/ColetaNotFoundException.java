package br.com.patrickinfnet.entregaservice.exception;

public class ColetaNotFoundException extends RuntimeException{
    public ColetaNotFoundException() {
    }

    public ColetaNotFoundException(String message) {
        super(message);
    }
}
