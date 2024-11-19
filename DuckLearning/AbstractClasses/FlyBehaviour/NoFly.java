package DuckLearning.AbstractClasses.FlyBehaviour;

import DuckLearning.Interfaces.FlyBehaviour;

public  class NoFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Cannot Fly With Wings");
    }
}
