package ua.edu.ucu.apps.flowerstore.flowers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping("/api/flower/")
public class FlowerController {
    @GetMapping("/createflower")
    public String createFlower() {
        return new Flower(FlowerType.TULIP, 100, FlowerColor.RED).toString();
    }

    @GetMapping("/flowerWithParam")
    public String createFlower(@RequestParam String name, @RequestParam double price, @RequestParam String color){
        switch (name) {
            case "Tulip", "tulip":
                return new Flower(FlowerType.TULIP, price, FlowerColor.RED).toString();
            case "Rose", "rose":
                return new Flower(FlowerType.ROSE, price, FlowerColor.RED).toString();
            case "Chamomile", "chamomile":
                return new Flower(FlowerType.CHAMOMILE, price, FlowerColor.RED).toString();
            default:
                return "";
        }
    }

    @GetMapping("/list")
    public ArrayList<Flower> createList() {
        return new ArrayList<Flower>(Arrays.asList(new Flower(FlowerType.ROSE, 3, FlowerColor.RED)));
    }
}
