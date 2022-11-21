package dev.fabulous.com.repository;

import dev.fabulous.com.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
