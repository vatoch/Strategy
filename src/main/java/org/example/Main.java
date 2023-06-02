package org.example;

public class Main {
    public static void main(String[] args) {


        ShoppingCart shoppingCart = new ShoppingCart();

        // setting the payment strategy
        shoppingCart.setPaymentStrategy(new BogPayment("41432423423","10/25","433"));
        // paying with bog
        shoppingCart.checkout(25.9);


        // we want to change to paypal

        shoppingCart.setPaymentStrategy(new PaypalPayment("vatochitaia5@gmail.com","vatovato"));

        shoppingCart.checkout(254.0);


    }
}