package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class whatsapp implements Applications{
    public void doubleClick(){
        System.out.println("open WhatsApp");
    }
    public void swipeleft(){
        System.out.println("shows whatsapp's status ");
    }
}
