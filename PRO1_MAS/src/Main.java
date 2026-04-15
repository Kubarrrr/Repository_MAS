import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String file = "data.dat";
        Car.readExtend(file);

        //Sprawdzenie ekstensji
        Car car1 = new Car("Car1","niebieski",1000,Optional.empty());
        Car car2 = new Car("Car2","zolty",2000, Optional.of(true));
        Car car3 = new Car("Car3","zielony",3000, Optional.of(false));
        Car car4 = new Car("Car4","fioletowy",4000, Optional.empty());

        Car.getNumberOfWheels();

        Car.getExtent();

        car4.addAccessory("grzane fotele");

        Car.getExtent();

        car1.getBruttoPrice();

        car1.addAccessory(List.of("hak","wentylowane fotele"));
        car1.addAccessory("skórzane fotele");
        Car.getExtent();

        car1.getAccessories();


        Car.writeExtend(file);
    }
}
