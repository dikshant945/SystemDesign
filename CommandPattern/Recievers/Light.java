package CommandPattern.Recievers;

import java.util.List;

// order
public class Light {

    private Light light;

    private String description;

    public Light (String  descirption) {
        this.description = description;
    }

    public void turnOn() {
        System.out.println("Light is turnedOn !");
    }

    public void turnOff() {
        System.out.println("Light is turnedOf !");
    }

    @Override
    public String toString() {
        return "Light{" +
                "description='" + description + '\'' +
                '}';
    }
}
