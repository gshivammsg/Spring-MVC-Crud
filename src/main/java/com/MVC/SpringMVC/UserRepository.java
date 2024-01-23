package com.MVC.SpringMVC;

// src/main/java/com/example/repository/UserRepository.java

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
