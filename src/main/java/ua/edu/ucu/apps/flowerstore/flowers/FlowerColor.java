package ua.edu.ucu.apps.flowerstore.flowers;

public enum FlowerColor {
    RED("red"),GREEN("blue"), BLUE("blue");

    private String label;

    FlowerColor(String label) {
        this.label = label;
    }

    public String ToString() {
        return label;
    }


}
