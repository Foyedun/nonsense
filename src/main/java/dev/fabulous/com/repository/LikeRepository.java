package dev.fabulous.com.repository;

import dev.fabulous.com.entities.Comment;
import dev.fabulous.com.entities.Like;
import dev.fabulous.com.entities.Post;
import dev.fabulous.com.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LikeRepository extends JpaRepository<Like, Long> {

    Optional<Like> findByPostsAndUsers(Post posts, User users);
    Optional<Like> findByCommentsAndUsers(Comment comments, User users);
}
