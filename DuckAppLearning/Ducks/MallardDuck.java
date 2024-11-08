package DuckAppLearning.Ducks;

import DuckAppLearning.AbstractClasses.FlyBehaviour.FlyWithWings;
import DuckAppLearning.AbstractClasses.QuackBehaviour.NoQuacking;
import DuckAppLearning.Duck;

public class MallardDuck extends Duck {
        public MallardDuck() {
//        setFlyBehaviour(flyWithWings);
//        setQuackBehaviour(noQuacking);
          this.setFlyBehaviour(new FlyWithWings());
          this.setQuackBehaviour(new NoQuacking());
    }


}
