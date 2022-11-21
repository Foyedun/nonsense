package dev.fabulous.com.service;

import dev.fabulous.com.entities.Comment;
import dev.fabulous.com.entities.Like;
import dev.fabulous.com.entities.Post;
import dev.fabulous.com.entities.User;

import java.util.Optional;

public interface LikeService {
    void addLike(Like like);
    void removeLike(Long id);

    Optional<Like> getPostLikeByUser(Post post, User user);
    Optional<Like> getCommentLikeByUser(Comment comment, User user);
}
