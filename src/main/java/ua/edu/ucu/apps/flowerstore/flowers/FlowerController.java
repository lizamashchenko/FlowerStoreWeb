package ua.edu.ucu.apps.flowerstore.flowers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
@RequestMapping("/api/flower/")
public class FlowerController {
    @GetMapping("/createflower")
    public String createFlower() {
        return new Flower("tulip", 100, 45).toString();
    }

    @GetMapping("/flowerWithParam")
    public String createFlower(@RequestParam String name, @RequestParam double price, @RequestParam double sepalLength){
        return new Flower(name, price, sepalLength).toString();
    }

    @GetMapping("/list")
    public ArrayList<Flower> createList() {
        return new ArrayList<Flower>(Arrays.asList(new Flower("rose", 3, 200)));
    }
}
