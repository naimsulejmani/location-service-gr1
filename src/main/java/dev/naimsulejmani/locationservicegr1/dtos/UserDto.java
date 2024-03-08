package dev.naimsulejmani.locationservicegr1.dtos;

import lombok.Data;

import java.time.LocalDate;

@Data
public class UserDto {
    private long id;
    private String username;
    private String password;
    private String email;
    private String name;
    private String surname;
    private LocalDate birthdate;
    private char gender;
    private RoleDto role;
}
