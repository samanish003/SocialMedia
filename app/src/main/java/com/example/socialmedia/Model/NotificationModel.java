package com.example.socialmedia.Model;

public class NotificationModel {

    int profile;
    String noification, time;

    public NotificationModel(int profile, String noification, String time) {
        this.profile = profile;
        this.noification = noification;
        this.time = time;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public String getNoification() {
        return noification;
    }

    public void setNoification(String noification) {
        this.noification = noification;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
