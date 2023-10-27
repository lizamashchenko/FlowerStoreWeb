package ua.edu.ucu.apps.flowerstore.store;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import ua.edu.ucu.apps.delivery.DeliveryMethod;
import ua.edu.ucu.apps.payment.PaymentMethod;

import java.util.HashMap;
import java.util.Map;

@ToString @AllArgsConstructor
public class Order {
    private Map<Item, Integer> items = new HashMap<>();
    @Getter
    private double totalPrice = 0;
    private PaymentMethod paymentMethod = PaymentMethod.Cash;
    private DeliveryMethod deliveryMethod = DeliveryMethod.Post;

    public Order() {
    }

    public Order(Map<Item, Integer> orderedItems) {
        items = orderedItems;
        for (Map.Entry<Item, Integer> entry : items.entrySet())
        {
            totalPrice += entry.getKey().getPrice() * entry.getValue();
        }
    }
}

