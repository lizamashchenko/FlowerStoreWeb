package ua.edu.ucu.apps.flowerstore.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;
import ua.edu.ucu.apps.flowerstore.store.Item;

@AllArgsConstructor @ToString @Getter
public class Flower extends Item {
    private FlowerType flowerType;
    private double sepalLength;
    private FlowerColor color;


    public Flower() { }
    public Flower(FlowerType type) {
        flowerType = type;
    }
    public Flower(Flower other) {
        this.sepalLength = other.sepalLength;
        this.color = other.color;
        this.price = other.price;
        this.flowerType = other.flowerType;

    }
    public String getColor() {
        return color.toString();
    }
}
