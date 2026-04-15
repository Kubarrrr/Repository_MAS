import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Car implements Serializable {
    //Ekstensja
    private static List<Car> extent = new ArrayList<>();
    //Atrybut złozony
    private List<Wheel> wheels;
    //Atrybut prosty
    String name;
    private String color;
    private float price;
    //Atrybut opcjonalny
    private Boolean systemGps;
    //Atrybut powtarzalny
    private List<String> accesories = new ArrayList<>();
    //Atrybut klasowy
    private static final int NUMBER_OF_WHEELS = 4;

    //Trwałość ekstensji
    private static final long serialVersionUID = 1L;

    public static void writeExtend(String fileName) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(extent);
            System.out.println("Extension save to file: " + fileName);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static void readExtend(String fileName) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
            extent = (List<Car>)(ois.readObject());
            System.out.println("Extension readed from file: " + fileName);
        } catch (FileNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public Car(String name, String color, float price, Optional<Boolean> systemGps) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.systemGps = systemGps.orElse(null);

        wheels = new ArrayList<Wheel>();
        for (int i = 0; i < 4; i++) {
            wheels.add(new Wheel(19, 2.3));
        }
        addCar(this);
    }

    private static void addCar(Car car) {
        extent.add(car);
    }
    private static void removeCar(Car car) {
        extent.remove(car);
    }

    public static void getExtent() {
        System.out.println("============================");
        System.out.println("Cars extension");

        for (Car car : extent) {
            System.out.println(car.toString());
        }
    }

    public void addAccessory(String accessory) {
        accesories.add(accessory);
    }
    public void removeAccessory(String accessory) {
        accesories.remove(accessory);
    }
    public void getAccessories() {
        System.out.println(name + " list of accessories: " + accesories);
    }


    public void getBruttoPrice() {
        System.out.println(name);
        System.out.println("Netto price: " + price);
        System.out.println("Brutto price: " + price * 1.23);
    }

    //Metoda klasowa
    public static void getNumberOfWheels() {
        System.out.println("Number of wheels for all cars: " + NUMBER_OF_WHEELS);
    }
    //Przeciążenie
    public void addAccessory(List<String> accessories) {
        accesories.addAll(accessories);
    }

    //Przesłonięcie
    @Override
    public String toString() {
        return  "Information about: " + name +
                "\n Color: " + color +
                "\n Price: " + price +
                "\n System GPS: " + systemGps +
                "\n Accessories: " + accesories +
                "\n============================" ;
    }
}
