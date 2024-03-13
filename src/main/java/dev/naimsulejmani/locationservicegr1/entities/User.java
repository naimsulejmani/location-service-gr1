package dev.naimsulejmani.locationservicegr1.entities;

import dev.naimsulejmani.locationservicegr1.infrastructure.helpers.HasId;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User implements HasId<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String username;
    private String password;

    @Column(unique = true)
    private String email;

    private String name;
    private String surname;
    private LocalDate birthdate;
    private char gender;

    @ManyToOne
    @JoinColumn(name = "role_id")
    private Role role;

}










