package com.johnslayer.BuySell.repositories;

import com.johnslayer.BuySell.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
