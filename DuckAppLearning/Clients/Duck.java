package DuckAppLearning.Clients;

import DuckAppLearning.Interfaces.FlyBehaviour;
import DuckAppLearning.Interfaces.QuackBehaviour;

public abstract class Duck {
    FlyBehaviour flyBehaviour;
    QuackBehaviour quackBehaviour;

    public void peformFly() {
        flyBehaviour.fly();
    }

    public void peformQuack() {
        quackBehaviour.quack();
    }

    public QuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour qb) {
        this.quackBehaviour = qb;
    }

    public void setFlyBehaviour(FlyBehaviour fb) {
        this.flyBehaviour = fb;
    }


    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }

    public void swim() {
        System.out.println("Duck is swimming !");
    }

    void walk() {
        System.out.println("Duck is Walking !");
    }

}
