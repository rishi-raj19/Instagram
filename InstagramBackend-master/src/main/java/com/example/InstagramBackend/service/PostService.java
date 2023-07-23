package com.example.InstagramBackend.service;

import com.example.InstagramBackend.model.Post;
import com.example.InstagramBackend.repository.IPostRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PostService {

    @Autowired
    IPostRepo postRepo;

    public String createInstaPost(Post post) {
        post.setCreatedDate(LocalDateTime.now());
        postRepo.save(post);
        return "Post uploaded!!!!";
    }

    public Post getPostById(Long id) {
        return postRepo.findById(id).orElse(null);
    }


}
