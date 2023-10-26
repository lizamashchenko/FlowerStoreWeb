package ua.edu.ucu.apps.payment.CreditCard;

import ua.edu.ucu.apps.payment.PaymentStrategy;

public class CardPayStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("payed with card: " + amount + "$");
    }
}
