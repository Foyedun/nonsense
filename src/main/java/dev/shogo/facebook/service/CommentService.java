package dev.shogo.facebook.service;

import dev.shogo.facebook.entities.Comment;

public interface CommentService {

    Comment createComment(Comment comment);

    Comment getComment(Long id);

    void updateComment(Comment updateComment);

    void deleteComment(Long id);

}
