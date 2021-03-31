package com.project.upgrade.userformvalidation.model;

import javax.persistence.Column;

public class Post {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "name")
    private String name;




}
