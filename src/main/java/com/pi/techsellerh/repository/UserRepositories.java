package com.pi.techsellerh.repository;

import com.pi.techsellerh.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserRepositories extends JpaRepository<User, String> {

    UserDetails findByUsername(String login);

}
