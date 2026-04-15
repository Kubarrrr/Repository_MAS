import java.io.Serializable;

public class Wheel implements Serializable {
    private static final long serialVersionUID = 1L;
    private int size;
    private double pressure;

    public Wheel(int size, double pressure) {
        this.size = size;
        this.pressure = pressure;
    }
}
