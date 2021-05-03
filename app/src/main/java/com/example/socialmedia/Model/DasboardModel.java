package com.example.socialmedia.Model;

public class DasboardModel {

    int profile, save, postImage;
    String name , about, like, comment, share;

    public DasboardModel(int profile, int save, int postImage, String name, String about, String like, String comment, String share) {
        this.profile = profile;
        this.save = save;
        this.postImage = postImage;
        this.name = name;
        this.about = about;
        this.like = like;
        this.comment = comment;
        this.share = share;
    }

    public int getProfile() {
        return profile;
    }

    public void setProfile(int profile) {
        this.profile = profile;
    }

    public int getSave() {
        return save;
    }

    public void setSave(int save) {
        this.save = save;
    }

    public int getPostImage() {
        return postImage;
    }

    public void setPostImage(int postImage) {
        this.postImage = postImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getShare() {
        return share;
    }

    public void setShare(String share) {
        this.share = share;
    }
}
