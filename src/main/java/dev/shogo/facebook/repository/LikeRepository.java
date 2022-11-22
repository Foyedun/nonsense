package dev.shogo.facebook.repository;

import dev.shogo.facebook.entities.Comment;
import dev.shogo.facebook.entities.Like;
import dev.shogo.facebook.entities.Post;
import dev.shogo.facebook.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LikeRepository extends JpaRepository<Like, Long> {

    Optional<Like> findByPostsAndUsers(Post posts, User users);
    Optional<Like> findByCommentsAndUsers(Comment comments, User users);
}
