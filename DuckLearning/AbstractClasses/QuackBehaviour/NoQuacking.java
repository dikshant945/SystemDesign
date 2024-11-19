package DuckLearning.AbstractClasses.QuackBehaviour;

import DuckLearning.Interfaces.QuackBehaviour;

public class NoQuacking implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Cannot Quack");
    }
}
