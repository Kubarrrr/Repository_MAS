package Kompozycja;

public class Silnik {
    private String model;
    private int power;
    private Auto auto;

    public Silnik(String model, int power, Auto auto) {
        this.model = model;
        this.power = power;
        this.auto = auto;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Power: " + power + "KM";
    }
}
