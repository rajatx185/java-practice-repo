package com.java.learn;

// private, public, setter, getter is how we achieve encapsulation.
// In object-oriented programming, encapsulation refers to the bundling of data with the methods that operate on that data, or the restricting of direct access to some of an object's components.

public class Account {
    private float balance;
    
    public void deposit(float amount) {
        if(amount>0) {
            balance += amount;
        }
    }

    public void withdraw(float amount) {
        if (amount>0) {
            balance -= amount;
        }
    }

    public float getBalance() {
        return balance;
    }

}