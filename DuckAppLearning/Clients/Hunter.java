package DuckAppLearning.Clients;

import DuckAppLearning.Interfaces.QuackBehaviour;

public class Hunter {
    // Strategy design Pattern
    QuackBehaviour quackBehaviour;


    public void setQuackBehaviour(QuackBehaviour qb) {
        this.quackBehaviour = qb;
    }


    public void fakeQuackToKillDucks() {
        quackBehaviour.quack();
    }

}
