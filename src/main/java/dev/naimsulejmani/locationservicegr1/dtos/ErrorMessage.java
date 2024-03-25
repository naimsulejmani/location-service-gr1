package dev.naimsulejmani.locationservicegr1.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorMessage {
    private int status;
    private LocalDateTime timestamp = LocalDateTime.now();
    private  String message;
    private String url;
}
