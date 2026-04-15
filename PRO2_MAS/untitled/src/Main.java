import Kompozycja.Auto;
import Kompozycja.Silnik;
import Kwalifikowana.Firma;
import Kwalifikowana.Pracownik;
import Zwykla.Car;
import Zwykla.CarRental;
import zAtrybutem.Klient;
import zAtrybutem.Samochod;
import zAtrybutem.Umowa;

void main() {

    //1 Zwykła
    CarRental carRental1 = new CarRental("rent1",20);
    CarRental carRental2 = new CarRental("rent2",20);

    Car car1 = new Car(1,"toyota", 2000.20, "ADDDAS","zielony", carRental1);
    Car car2 = new Car(2,"mazda", 4000.20, "GSFSSF1223","czerwony", carRental1);
    Car car3 = new Car(3,"fiat", 25000.20, "HSXXCAD","czerwony",  carRental2);
    Car car4 = new Car(4,"subaru", 142200.20, "ASDGXCVAS","zielony",  carRental2);

    carRental1.getCars();
    carRental2.getCars();

    System.out.println(carRental1.getCarsCheaperThan(212312321));
    System.out.println(carRental2.getCarsCheaperThan(232));

    System.out.println(carRental1.getCarsWithColor("czerwony"));
    System.out.println(carRental2.getCarsWithColor("czerwony"));


    System.out.println("===========================================");
    //Kwalifikowana
    Firma firma1 = new Firma("firma1");
    Pracownik pracownik = new Pracownik("Jan", 20, 123, firma1);

    firma1.addPracownik(pracownik);
    System.out.println(firma1.getPracownik(123));
    System.out.println("===========================================");
    //Z atrybutem

    Samochod samochod = new Samochod("toyota", "ASDADSAD");
    Klient klient = new Klient("Darek");
    Umowa umowa = new Umowa(200.30, samochod, klient);

    System.out.println(umowa);


    System.out.println("===========================================");
    //Kompozycja
    Auto auto = new Auto("dodge", "czerwony", "ADD-1311", 300);
    System.out.println(auto);
}
