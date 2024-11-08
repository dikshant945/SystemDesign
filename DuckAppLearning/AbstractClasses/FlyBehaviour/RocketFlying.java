package DuckAppLearning.AbstractClasses.FlyBehaviour;

import DuckAppLearning.Interfaces.FlyBehaviour;

public class RocketFlying implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Flying With a Rocket !");
    }
}
