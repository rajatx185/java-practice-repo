package com.java.learn;

// public means that the class, attribute, method etc can be accessed anywhere in the project
// static means that the method can be called with creating an instance of the class

public class User {
    // Fields
    public String name;

    // Constructor
    public User(String name) {
        this.name = name;
    }

    // Methods
    public void sayHello() {
        System.out.println("Hi, my name is " + name);
    }
}
