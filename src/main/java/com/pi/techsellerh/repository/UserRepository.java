package com.pi.techsellerh.repository;

import com.pi.techsellerh.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import java.util.UUID;


@Repository

public interface UserRepository extends JpaRepository<User, UUID> {
    User findByUsername(String username);

}
