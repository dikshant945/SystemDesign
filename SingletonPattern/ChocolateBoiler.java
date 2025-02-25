package SingletonPattern;

public class ChocolateBoiler {

    boolean isEmpty;
    boolean filled;

    private static ChocolateBoiler instance;

    private ChocolateBoiler() {
        isEmpty = true;
        filled = false;

    }

    public static ChocolateBoiler getInstance() {
        if(instance == null) {
            instance = new ChocolateBoiler();
        }

        return instance;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }
}
