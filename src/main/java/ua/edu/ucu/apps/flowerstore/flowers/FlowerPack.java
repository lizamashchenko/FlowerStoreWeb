package ua.edu.ucu.apps.flowerstore.flowers;

import lombok.Getter;
import lombok.Setter;
import ua.edu.ucu.apps.flowerstore.store.Item;

@Getter
public class FlowerPack extends Item {
    @Setter
    private Flower flower;
    private int quantity = 1;
    private double packPrice;

    public FlowerPack(Flower flower, int quantity) {
        this.flower = new Flower(flower);
        this.quantity = quantity;
        updatePrice();
    }
    public FlowerPack(Flower fl) {
        flower = new Flower(fl);
        updatePrice();
    }
    public void setQuantity(int quantityDif) {
        quantity += quantityDif;
        quantity = Math.max(quantity, 1);
        updatePrice();
    }
    private void updatePrice() {
        packPrice = quantity * flower.getPrice();
    }

    public boolean sell(int amount) {
        if (this.quantity < amount) {
            return false;
        }
        this.quantity -= amount;
        return true;
    }

    public boolean matches(FlowerPack other) {
        return (other.getFlower() == flower && other.getQuantity() <= quantity);
    }

}

