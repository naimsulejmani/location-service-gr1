package dev.naimsulejmani.locationservicegr1.entities;

import dev.naimsulejmani.locationservicegr1.infrastructure.helpers.HasId;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "families")
@Getter
@Setter
public class Family implements HasId<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "family", fetch = FetchType.LAZY)
    private List<FamilyMember> familyMembers;


}





