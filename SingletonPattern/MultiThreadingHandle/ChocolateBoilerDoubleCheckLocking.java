package SingletonPattern.MultiThreadingHandle;

public class ChocolateBoilerDoubleCheckLocking {
    boolean isEmpty;
    boolean isFilled;

    private static  ChocolateBoilerDoubleCheckLocking instance;

    private ChocolateBoilerDoubleCheckLocking() {
        isEmpty = true;
        isFilled = false;
    }

    private static ChocolateBoilerDoubleCheckLocking getInstance() {
        synchronized (ChocolateBoilerDoubleCheckLocking.class) {
            if (instance == null) {
                instance = new ChocolateBoilerDoubleCheckLocking();
            }
        }

        return instance;
    }
}
