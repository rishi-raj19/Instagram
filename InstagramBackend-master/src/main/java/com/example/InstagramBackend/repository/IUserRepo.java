package com.example.InstagramBackend.repository;

import com.example.InstagramBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Long> {
    User findFirstByUserEmail(String email);
}