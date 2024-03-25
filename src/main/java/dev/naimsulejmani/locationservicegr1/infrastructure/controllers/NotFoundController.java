package dev.naimsulejmani.locationservicegr1.infrastructure.controllers;

import dev.naimsulejmani.locationservicegr1.dtos.ErrorMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.ServletWebRequest;

@RestController
@RequestMapping("/api")
public class NotFoundController {

    @RequestMapping(value = "/**")
    public ResponseEntity<?> notFound(ServletWebRequest request) {
        ErrorMessage message = new ErrorMessage();
        message.setMessage("Route not found");
        message.setStatus(HttpStatus.NOT_FOUND.value());
        message.setUrl(request.getRequest().getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(message);
    }
}
