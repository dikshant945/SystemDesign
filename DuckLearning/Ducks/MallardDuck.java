package DuckLearning.Ducks;

import DuckLearning.AbstractClasses.FlyBehaviour.FlyWithWings;
import DuckLearning.AbstractClasses.QuackBehaviour.NoQuacking;
import DuckLearning.Clients.Duck;

public class MallardDuck extends Duck {
        public MallardDuck() {
//        setFlyBehaviour(flyWithWings);
//        setQuackBehaviour(noQuacking);
          this.setFlyBehaviour(new FlyWithWings());
          this.setQuackBehaviour(new NoQuacking());
    }


}
