package dev.naimsulejmani.locationservicegr1.infrastructure.exceptions;

public class NotAuthorizedException extends ApiRuntimeException {

    public NotAuthorizedException() {
    }

    public NotAuthorizedException(String message) {
        super(message);
    }
}
