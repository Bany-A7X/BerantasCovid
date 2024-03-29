package com.bany.berantascovid19.model;

public class User {
    private String id, username, fullname, imageurl;

    public User(String id, String username, String fullname, String imageurl){
        this.id = id;
        this.username = username;
        this.fullname = fullname;
        this.imageurl = imageurl;
    }

    public User(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

}
