package zAtrybutem;

import jdk.dynalink.linker.support.Lookup;

import java.time.LocalDate;

public class Umowa {
    private double price;
    private LocalDate date;
    private Samochod samochod;
    private Klient klient;

    public Umowa(double price, Samochod samochod, Klient klient) {
        if (samochod == null || klient == null) {
            throw new IllegalArgumentException("Samochod i klient muszą istniec");
        }
        this.price = price;
        this.date = LocalDate.now();
        this.samochod = samochod;
        this.klient = klient;

        samochod.dodajUmowe(this);
        klient.dodajUmowe(this);
    }

    @Override
    public String toString() {
        return "Umowa: " + samochod.getModel() + " VIN: " + samochod.getVin() + " -----> " + klient.getName() + "\nData podpisania: " + date + " | Cena: " + price;
    }
}
