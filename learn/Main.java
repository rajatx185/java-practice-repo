package com.java.learn;

public class Main {
    public static void main(String[] args) {
        // User user = new User("rajat g");
        // System.out.println(user.name);
        // user.sayHello();

        // TaxCalculator calculator = getCalculator();
        // System.out.println(calculator.calculateTax());

        var account = new Account();
        account.deposit(1000);
        account.withdraw(399);
        System.out.println(account.getBalance());
    }

    // public static TaxCalculator getCalculator() {
    //     return new TaxCalculator2020();
    // }
}
