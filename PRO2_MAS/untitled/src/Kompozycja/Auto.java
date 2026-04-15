package Kompozycja;

public class Auto {
    private String model;
    private String color;
    private Silnik silnik;

    public Auto(String model, String color, String silnikModel, int silnikMoc) {
        this.model = model;
        this.color = color;
        this.silnik = new  Silnik(silnikModel, silnikMoc, this);
    }

    public Silnik getSilnik() {
        return silnik;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Color: " + color + ", Silnik: " + silnik;
    }
}
