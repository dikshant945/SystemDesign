package DuckLearning.AbstractClasses.QuackBehaviour;

import DuckLearning.Interfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quacking");
    }
}
