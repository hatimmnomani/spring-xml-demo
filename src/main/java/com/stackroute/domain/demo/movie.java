package com.stackroute.domain.demo;

public class movie  {

    private Actor actor = new Actor();

    public movie(com.stackroute.domain.demo.Actor actor) {
        this.actor = actor;
    }

    public com.stackroute.domain.demo.Actor getActor() {
        return actor;
    }

    public void setActor(com.stackroute.domain.demo.Actor actor) {
        this.actor = actor;
    }
}