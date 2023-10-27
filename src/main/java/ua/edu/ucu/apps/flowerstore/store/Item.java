package ua.edu.ucu.apps.flowerstore.store;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public class Item {
    protected double price = 0;

    public Item() {}
    protected void updatePrice(double priceDifference) {
        price += priceDifference;
    }
}
