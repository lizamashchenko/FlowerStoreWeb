package ua.edu.ucu.apps.flowerstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ua.edu.ucu.apps.flowerstore.flowers.Flower;

@SpringBootApplication
@RestController
public class FlowerStoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlowerStoreApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/calculate")
    public int addition(@RequestParam int a, @RequestParam
            int b) {
        return a + b;
    }


}
