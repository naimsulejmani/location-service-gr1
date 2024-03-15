package dev.naimsulejmani.locationservicegr1.entities;


import dev.naimsulejmani.locationservicegr1.infrastructure.helpers.HasId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "locations")
@Getter
@Setter
public class Location implements HasId<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "family_member_id")
    private FamilyMember familyMember;

    private double latitude;
    private double longitude;
    private LocalDateTime reportDate;
}














