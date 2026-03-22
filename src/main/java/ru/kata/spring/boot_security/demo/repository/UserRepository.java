package ru.kata.spring.boot_security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

    @Query("select distinct u from User u left join fetch u.roles")
    List<User> findAllWithRoles();

    @Query("select u from User u left join fetch u.roles where u.id = :id")
    Optional<User> findByIdWithRoles(Long id);

    @Query("select u from User u left join fetch u.roles where u.username = :username")
    Optional<User> findByUsernameWithRoles(String username);
}