package dev.fabulous.com.service;

import dev.fabulous.com.entities.Comment;

public interface CommentService {

    Comment createComment(Comment comment);

    Comment getComment(Long id);

    void updateComment(Comment updateComment);

    void deleteComment(Long id);

}
