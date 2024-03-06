package dev.naimsulejmani.locationservicegr1.repositories;

import dev.naimsulejmani.locationservicegr1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    //SELECT * FROM Users WHERE username = @username
    public Optional<User> findByUsername(String username);
    //SELECT * FROM Users WHERE username = @username
    public Optional<User> findByEmail(String email);

    @Query("SELECT u FROM User u WHERE u.email=:usernameOrEmail or u.username=:usernameOrEmail")
//
    public Optional<User> findByUsernameOrEmail(String usernameOrEmail);
}







