package com.stackroute.domain;

public class movie  {
    private Actor actor;

    public movie(com.stackroute.domain.Actor actor) {
        this.actor = actor;
    }

    public movie() {
    }

    public com.stackroute.domain.Actor getActor() {
        return actor;
    }

    public void setActor(com.stackroute.domain.Actor actor) {
        this.actor = actor;
    }




}
