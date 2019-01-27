package com.jinjian.demo.spring;

public class SpringCoreHelloWorld {
    private String message = null;
 
    public String getMessage() {
        return message;
    }
 
    public void setMessage(String message) {
        this.message = message;
    }   
     
    public void sayHello() {
        System.out.println(getMessage());
    }
}