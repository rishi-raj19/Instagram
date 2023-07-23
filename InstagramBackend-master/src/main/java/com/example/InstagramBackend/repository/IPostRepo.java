package com.example.InstagramBackend.repository;

import com.example.InstagramBackend.model.Post;
import com.example.InstagramBackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepo extends JpaRepository<Post,Long> {

    Post findFirstByUser(User user);
}