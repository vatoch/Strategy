package org.example;

public class BogPayment implements PaymentStrategy{

    private String cardNumber;
    private String expDate;
    private String cvv;


    public BogPayment(String cardNumber,String expDate,String cvv) {
        this.cardNumber=cardNumber;
        this.expDate=expDate;
        this.cvv=cvv;

    }

    @Override
    public void pay(double amount) {
        System.out.println("paying with bog");

    }
}
