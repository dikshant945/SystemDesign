package DuckAppLearning.Ducks;

import DuckAppLearning.AbstractClasses.FlyBehaviour.NoFly;
import DuckAppLearning.AbstractClasses.QuackBehaviour.Quack;
import DuckAppLearning.Duck;

public class TestDuck extends Duck {
    public TestDuck() {
//        setFlyBehaviour(noFly);
//        setQuackBehaviour(quack);
        this.setFlyBehaviour(new NoFly());
        this.setQuackBehaviour(new Quack());
    }
}
