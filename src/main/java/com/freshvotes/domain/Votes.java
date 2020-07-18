package com.freshvotes.domain;

import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity

public class Votes {

    private VoteId id;
    private Boolean upvote;

    @EmbeddedId
    public VoteId getId() {
        return id;
    }

    public void setId(VoteId id) {
        this.id = id;
    }


    public Boolean getUpvote() {
        return upvote;
    }

    public void setUpvote(Boolean upvote) {
        this.upvote = upvote;
    }
}
