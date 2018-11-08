package com.cedaniel200.screenplay.restapi.model;

import com.cedaniel200.screenplay.restapi.model.builder.UserBuilder;

public class User {

    private String id;
    private String createdAt;
    private String name;
    private String job;

    public User(UserBuilder builder) {
        name = builder.getName();
        job = builder.getJob();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

}
