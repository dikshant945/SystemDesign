package DuckAppLearning.AbstractClasses.QuackBehaviour;

import DuckAppLearning.Interfaces.QuackBehaviour;

public class NoQuacking implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Cannot Quack");
    }
}
