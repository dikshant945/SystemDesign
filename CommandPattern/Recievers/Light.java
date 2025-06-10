package CommandPattern.Recievers;

// order
public class Light {

    private Light light;

    public void Light(Light l) {
        this.light = l;
    }

    public void turnOn() {
        System.out.println("Light is turnedOn !");
    }

    public void turnOff() {
        System.out.println("Light is turnedOf !");
    }
}
