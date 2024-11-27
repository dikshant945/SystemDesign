package StrategyPatternDuckApp.Ducks;

import StrategyPatternDuckApp.AbstractClasses.FlyBehaviour.NoFly;
import StrategyPatternDuckApp.AbstractClasses.QuackBehaviour.Quack;
import StrategyPatternDuckApp.Clients.Duck;

public class TestDuck extends Duck {
    public TestDuck() {
//        setFlyBehaviour(noFly);
//        setQuackBehaviour(quack);
        this.setFlyBehaviour(new NoFly());
        this.setQuackBehaviour(new Quack());
    }
}
