package DuckAppLearning.AbstractClasses.FlyBehaviour;

import DuckAppLearning.Interfaces.FlyBehaviour;

public  class  FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("Yeah I Flying With Wings");
    }
}
