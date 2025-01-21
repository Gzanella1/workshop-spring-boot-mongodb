package com.giovani.workshopmongo.services.exception;

public class ObjectNotFoundException extends RuntimeException {

    // não exige que o erro seja tratado com o runtimeExeption

    private static final long serialVersionUID = 1L;

    public ObjectNotFoundException(String message) {
        super(message);
    }

}
