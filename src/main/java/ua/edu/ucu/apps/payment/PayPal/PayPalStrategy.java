package ua.edu.ucu.apps.payment.PayPal;

import ua.edu.ucu.apps.payment.PaymentStrategy;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PayPalStrategy implements PaymentStrategy {

    public void pay(double amount) {
        System.out.println("pay with paypal: " + amount + "$");
    }
}
