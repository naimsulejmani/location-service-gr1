package dev.naimsulejmani.locationservicegr1.controllers.advices;

import dev.naimsulejmani.locationservicegr1.infrastructure.exceptions.AlreadyExistException;
import dev.naimsulejmani.locationservicegr1.infrastructure.exceptions.NotAuthorizedException;
import dev.naimsulejmani.locationservicegr1.infrastructure.exceptions.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionHandlerAdvice {


    @ExceptionHandler(NotFoundException.class)
    public static ResponseEntity<?> handleNotFoundException(NotFoundException exception) {
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
    }

    @ExceptionHandler(AlreadyExistException.class)
    public static ResponseEntity<?> handleConflictException(AlreadyExistException exception) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(exception.getMessage());
    }

    @ExceptionHandler(NotAuthorizedException.class)
    public static ResponseEntity<?> handleNotAuthorizedException(NotAuthorizedException exception) {
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(exception.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public static ResponseEntity<?> handleOtherExceptions(Exception exception) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(exception.getMessage());
    }


}











