package org.example;

public class PaypalPayment implements PaymentStrategy{
    private String email;
    private String password;

    public PaypalPayment(String email, String password) {
        this.email= email;
        this.password = password;

        System.out.println("logged in paypal ");

    }

    @Override
    public void pay(double amount) {
        System.out.println("paying with paypal");
    }
}
