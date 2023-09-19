package com.example.demo;

import org.springframework.stereotype.Component;

@Component

public class snapchat implements Applications{
    public void doubleClick(){
        System.out.println("open snapchat");
    }
    public void swipeleft(){
        System.out.println("shows snapchat stories");
    }
}
