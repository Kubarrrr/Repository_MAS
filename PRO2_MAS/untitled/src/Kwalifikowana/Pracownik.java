package Kwalifikowana;

public class Pracownik {
    private String name;
    private int age;
    private int number;
    private Firma firma;

    public Pracownik(String name, int age,  int number, Firma firma) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.firma = firma;
        firma.addPracownik(this);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setFirma(Firma firma) {
        this.firma = firma;
    }

    @Override
    public String toString() {
        return "Imie: " + name + " Wiek: " + age + " Numer: " + number + " Firma: " + firma;
    }
}
