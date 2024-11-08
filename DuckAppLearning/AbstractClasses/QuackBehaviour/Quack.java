package DuckAppLearning.AbstractClasses.QuackBehaviour;

import DuckAppLearning.Interfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quacking");
    }
}
