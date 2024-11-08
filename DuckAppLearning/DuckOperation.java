package DuckAppLearning;

import DuckAppLearning.Ducks.MallardDuck;
import DuckAppLearning.Ducks.TestDuck;


public class DuckOperation {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.peformFly();
        mallardDuck.peformQuack();
        mallardDuck.swim();


        Duck td = new TestDuck();
        td.peformFly();
        td.peformQuack();
        td.swim();
    }
}
