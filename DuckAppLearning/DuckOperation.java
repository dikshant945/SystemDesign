package DuckAppLearning;

import DuckAppLearning.AbstractClasses.FlyBehaviour.NoFly;
import DuckAppLearning.AbstractClasses.QuackBehaviour.NoQuacking;
import DuckAppLearning.Ducks.MallardDuck;
import DuckAppLearning.Ducks.ModelDuck;
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

        Duck modelDuck = new ModelDuck();
        modelDuck.setFlyBehaviour(new NoFly());
        modelDuck.setQuackBehaviour(new NoQuacking());
        modelDuck.peformFly();
        modelDuck.peformQuack();
    }
}
