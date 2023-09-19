package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component("user")
public class User {

    public User(){
        System.out.println("cont user");

    }
  Applications app;
@Autowired
    public User(Applications app){
        System.out.println("Constructor injection");
        this.app=app;
    }
    public Applications getApplications(){
        return app;
    }
    public void setApplications(Applications app){
        System.out.println("setter injection");
        this.app=app;
    }
}
