package com.andrewjunggg;

import java.util.Date;

public abstract class ITweet {
    private String content;

    private Date date;

    private User user;

    public ITweet(String content, User user) {
        this.content = content;
        this.user = user;
        this.date = new Date();
    }

    public ITweet(String content, User user, Date date) {
        this.content = content;
        this.user = user;
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public abstract String getFormattedContent();

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}