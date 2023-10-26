package ua.edu.ucu.apps.flowerstore.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor @ToString
public class Flower {

    @Getter
    private String name;
    @Getter
    private double price, sepalLength;
}
