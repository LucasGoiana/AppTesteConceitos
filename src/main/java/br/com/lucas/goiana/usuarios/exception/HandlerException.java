package br.com.lucas.goiana.usuarios.exception;

public class HandlerException extends Throwable {

    public HandlerException(Exception e) {
        System.err.println("Exception occurred:");
        System.err.println("Message: " + e.getMessage());
        System.err.println("Stack Trace:");
        e.printStackTrace(System.err);
    }

}
