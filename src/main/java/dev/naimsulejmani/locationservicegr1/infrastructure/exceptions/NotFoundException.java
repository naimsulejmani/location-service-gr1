package dev.naimsulejmani.locationservicegr1.infrastructure.exceptions;

public class NotFoundException extends ApiRuntimeException {
    public NotFoundException() {
    }

    public NotFoundException(String message) {
        super(message);
    }
}
