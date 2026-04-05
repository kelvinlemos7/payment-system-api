package com.kelvin.payment_processing_system.repositories;

import com.kelvin.payment_processing_system.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
