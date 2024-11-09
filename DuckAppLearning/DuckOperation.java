package DuckAppLearning;

import DuckAppLearning.AbstractClasses.FlyBehaviour.NoFly;
import DuckAppLearning.AbstractClasses.QuackBehaviour.NoQuacking;
import DuckAppLearning.AbstractClasses.QuackBehaviour.Quack;
import DuckAppLearning.Clients.Duck;
import DuckAppLearning.Clients.Hunter;
import DuckAppLearning.Ducks.MallardDuck;
import DuckAppLearning.Ducks.ModelDuck;
import DuckAppLearning.Ducks.TestDuck;
import DuckAppLearning.Interfaces.FlyBehaviour;
import DuckAppLearning.Interfaces.QuackBehaviour;


public class DuckOperation {
    public static void main(String[] args) {
        System.out.println("Welcome to the strategy Design Pattern :  Strategy design pattern is a type of pattern that defines a family of algorithm and encapsulate eah ones and  make them interchangable Like here in Duck we have put multiple algorithm like flyBehaviour and QuackBehaviour in them .. and also any client can use these algorithm !");
        Duck mallardDuck = new MallardDuck();
        mallardDuck.peformFly();
        mallardDuck.peformQuack();
        mallardDuck.swim();


        Duck td = new TestDuck();
        td.peformFly();
        td.peformQuack();
        td.swim();

        Duck modelDuck = new ModelDuck();
        modelDuck.setFlyBehaviour(new NoFly());
        modelDuck.setQuackBehaviour(new NoQuacking());
        modelDuck.peformFly();
        modelDuck.peformQuack();


        Hunter hunter = new Hunter();
        hunter.setQuackBehaviour( new Quack());
        hunter.fakeQuackToKillDucks();
    }
}
