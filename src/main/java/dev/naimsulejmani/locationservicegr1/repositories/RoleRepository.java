package dev.naimsulejmani.locationservicegr1.repositories;

import dev.naimsulejmani.locationservicegr1.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    public Optional<Role> findByName(String name);
}
