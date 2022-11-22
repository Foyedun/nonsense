package dev.shogo.facebook.service;

import dev.shogo.facebook.entities.Comment;
import dev.shogo.facebook.entities.Like;
import dev.shogo.facebook.entities.Post;
import dev.shogo.facebook.entities.User;

import java.util.Optional;

public interface LikeService {
    void addLike(Like like);
    void removeLike(Long id);

    Optional<Like> getPostLikeByUser(Post post, User user);
    Optional<Like> getCommentLikeByUser(Comment comment, User user);
}
