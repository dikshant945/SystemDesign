package SingletonPattern.MultiThreadingHandle;

public class ChocolateBoilerSynchronized {

    // NOTE:: This method is cool if our Object have alot of dependency it can make the operation very slow.
    // for Example :-  if my instance is being used my 1000000 classes than the starting of our machine will become very slow

    boolean isEmpty;
    boolean isFilled;

    private static  ChocolateBoilerSynchronized instance;

    private ChocolateBoilerSynchronized() {
        isEmpty = true;
        isFilled = false;
    }

    private synchronized static ChocolateBoilerSynchronized getInstance() {
        if(instance == null){
            instance = new ChocolateBoilerSynchronized();
        }

        return instance;
    }
}
