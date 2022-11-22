package dev.shogo.facebook.repository;

import dev.shogo.facebook.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
