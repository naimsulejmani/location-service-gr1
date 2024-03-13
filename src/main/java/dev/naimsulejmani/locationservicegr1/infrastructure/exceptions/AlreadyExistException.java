package dev.naimsulejmani.locationservicegr1.infrastructure.exceptions;

public class AlreadyExistException extends ApiRuntimeException {
    public AlreadyExistException() {
    }

    public AlreadyExistException(String message) {
        super(message);
    }
}
