package dev.naimsulejmani.locationservicegr1.entities;

import dev.naimsulejmani.locationservicegr1.infrastructure.helpers.HasId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "family_members")
@Getter
@Setter
public class FamilyMember implements HasId<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne()
    @JoinColumn(name = "family_id")
    private Family family;


    private Long id;
    private LocalDateTime requestDate;
    private LocalDateTime validTo;
    private Boolean approved;
    private LocalDateTime approvedDate;

    @OneToMany(mappedBy = "familyMember", fetch = FetchType.LAZY)
    private List<Location> locations;
}









