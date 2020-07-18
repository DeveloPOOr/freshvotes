package com.freshvotes.domain;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Comment {

    private CommentId id;
    private String text;

    @EmbeddedId
    public CommentId getId() {
        return id;
    }

    public void setId(CommentId id) {
        this.id = id;
    }

    @Column(length = 5000)
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
