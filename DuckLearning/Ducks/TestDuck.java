package DuckLearning.Ducks;

import DuckLearning.AbstractClasses.FlyBehaviour.NoFly;
import DuckLearning.AbstractClasses.QuackBehaviour.Quack;
import DuckLearning.Clients.Duck;

public class TestDuck extends Duck {
    public TestDuck() {
//        setFlyBehaviour(noFly);
//        setQuackBehaviour(quack);
        this.setFlyBehaviour(new NoFly());
        this.setQuackBehaviour(new Quack());
    }
}
