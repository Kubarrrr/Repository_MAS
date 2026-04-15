package zAtrybutem;

import java.util.ArrayList;
import java.util.List;

public class Klient {
    private String name;
    private List<Umowa> umowy = new ArrayList<>();

    public Klient(String name) {
        this.name = name;
    }

    public void dodajUmowe(Umowa umowa){
        if(!umowy.contains(umowa)){
            umowy.add(umowa);
        } else {
            System.out.println("Istnieje już umowa");
        }
    }

    public String getName() {
        return name;
    }
}
