package com.orderCraftSpringApp.repository;


import com.orderCraftSpringApp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}