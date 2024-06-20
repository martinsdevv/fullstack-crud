package com.martins.fstack.fullstack_app.repository;

import com.martins.fstack.fullstack_app.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
