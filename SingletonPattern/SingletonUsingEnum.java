package SingletonPattern;

public class SingletonUsingEnum {
    public enum Singleton {
        INSTANCE;

        private int value;

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void doSomething() {
            System.out.println("Singleton using Enum!");
        }
    }

    public static void main(String[] args) {
        Singleton instance1 = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;

        instance1.setValue(10);
        System.out.println(instance2.getValue()); // Output: 10

        instance1.doSomething();
    }

}
