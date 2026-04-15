package Kwalifikowana;

import Zwykla.Car;

import java.util.HashMap;
import java.util.Map;

public class Firma {
    private String name;
    private Map<Integer, Pracownik> pracownicy = new HashMap<>();

    public Firma(String name) {
        this.name = name;
    }

    public void addPracownik(Pracownik pracownik) {
        if (!pracownicy.containsKey(pracownik.getNumber())) {
            pracownicy.put(pracownik.getNumber(),pracownik);
            pracownik.setFirma(this);
        }
    }

    public Pracownik getPracownik(int pracownik) {
        return pracownicy.get(pracownik);
    }

    @Override
    public String toString() {
        return name;
    }
}
