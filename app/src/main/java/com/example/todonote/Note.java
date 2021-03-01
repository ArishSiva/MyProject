package com.example.todonote;

import com.google.firebase.Timestamp;

public class Note {
    private String title;
    private String date;
    private String time;
    private Timestamp created;
    private String userId;

    public Note() {

    }

    public Note(String title,String date , String time, Timestamp created, String userId) {
        this.title = title;
        this.date = date;
        this.time = time;
        this.created = created;
        this.userId = userId;
    }
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Note{" +
                "title='" + title + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", created=" + created +
                ", userId='" + userId + '\'' +
                '}';
    }
}
