package DuckLearning;

import DuckLearning.AbstractClasses.FlyBehaviour.NoFly;
import DuckLearning.AbstractClasses.QuackBehaviour.NoQuacking;
import DuckLearning.AbstractClasses.QuackBehaviour.Quack;
import DuckLearning.Clients.Duck;
import DuckLearning.Clients.Hunter;
import DuckLearning.Ducks.MallardDuck;
import DuckLearning.Ducks.ModelDuck;
import DuckLearning.Ducks.TestDuck;


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
