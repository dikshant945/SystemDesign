package StrategyPatternDuckApp.Ducks;

import StrategyPatternDuckApp.AbstractClasses.FlyBehaviour.FlyWithWings;
import StrategyPatternDuckApp.AbstractClasses.QuackBehaviour.NoQuacking;
import StrategyPatternDuckApp.Clients.Duck;

public class MallardDuck extends Duck {
        public MallardDuck() {
//        setFlyBehaviour(flyWithWings);
//        setQuackBehaviour(noQuacking);
          this.setFlyBehaviour(new FlyWithWings());
          this.setQuackBehaviour(new NoQuacking());
    }


}
