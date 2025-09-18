package com.project.userservice.repository;

import com.project.userservice.mdoel.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
