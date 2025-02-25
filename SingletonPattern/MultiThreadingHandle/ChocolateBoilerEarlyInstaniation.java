package SingletonPattern.MultiThreadingHandle;

public class ChocolateBoilerEarlyInstaniation {
    boolean isEmpty;
    boolean isFilled;

    private static  ChocolateBoilerEarlyInstaniation instance = new ChocolateBoilerEarlyInstaniation();

    private ChocolateBoilerEarlyInstaniation() {
        isEmpty = true;
        isFilled = false;
    }

    private synchronized static ChocolateBoilerEarlyInstaniation getInstance() {
        return instance;
    }
}
