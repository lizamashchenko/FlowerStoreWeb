package ua.edu.ucu.apps.flowerstore.flowers;

import ua.edu.ucu.apps.flowerstore.store.Item;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket extends Item {
    private List<FlowerPack> flowerPacks = new ArrayList<>();

    public FlowerBucket() {

    }
    public FlowerBucket(List<FlowerPack> flowerPacks) {
        for (FlowerPack fp : flowerPacks) {
            this.flowerPacks.add(fp);
            updatePrice(fp.getPackPrice());
        }
    }

    public void addPack(FlowerPack pack) {
        if (containsFlower(pack.getFlower())) {
            increaseQuantity(pack.getFlower(), pack.getQuantity());
        }
        flowerPacks.add(pack);
        updatePrice(pack.getPackPrice());
    }

    public void removePack(FlowerPack pack) {
        flowerPacks.remove(pack);
        updatePrice(-pack.getPackPrice());
    }

    private void increaseQuantity(Flower flower, int quantityAdded) {
        int i = 0;
        FlowerType flowerType = flower.getFlowerType();
        while (!flowerPacks.get(i).getFlower().equals(flowerType)) {
            i++;
        }
        flowerPacks.get(i).setQuantity(quantityAdded);
        updatePrice(flower.getPrice() * quantityAdded);
    }
    private boolean containsFlower(Flower flower) {
        for (FlowerPack flowerPack : flowerPacks) {
            if (flowerPack.getFlower().getFlowerType()
                    .equals(flower.getFlowerType())) {
                return true;
            }
        }
        return false;
    }

    protected void updatePrice(double priceDif) {
        super.updatePrice(priceDif);
    }

    private boolean containsFlowerPack(FlowerPack p) {
        return flowerPacks.contains(p);
    }

    public boolean matches(FlowerBucket other) {
        for (FlowerPack p : flowerPacks) {
            if (!other.containsFlowerPack(p)) {
                return false;
            }
        }
        return other.matches(this);
    }
}

