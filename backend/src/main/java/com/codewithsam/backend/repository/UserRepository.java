package com.codewithsam.backend.repository;

import com.codewithsam.backend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}