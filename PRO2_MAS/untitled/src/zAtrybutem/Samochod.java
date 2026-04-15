package zAtrybutem;

import java.util.ArrayList;
import java.util.List;

public class Samochod {
    private String model;
    private String vin;
    private List<Umowa> umowy = new ArrayList<>();

    public Samochod(String model, String vin) {
        this.model = model;
        this.vin = vin;
    }

    public void dodajUmowe(Umowa umowa) {
        if (!umowy.contains(umowa)) {
            umowy.add(umowa);
        } else {
            System.out.println("Istnieje już umowa");
        }
    }

    public String getModel() {
        return model;
    }

    public String getVin() {
        return vin;
    }
}
