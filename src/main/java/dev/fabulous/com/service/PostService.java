package dev.fabulous.com.service;

import dev.fabulous.com.entities.Post;

import java.util.List;

public interface PostService {
    Post createPost(Post post);

    List<Post> getAllPosts();

    Post getPost(Long id);

    void updatePost(Post updatePost);

    void deletePost(Long id);
}