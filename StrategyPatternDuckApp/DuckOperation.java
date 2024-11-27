package StrategyPatternDuckApp;

import StrategyPatternDuckApp.AbstractClasses.FlyBehaviour.NoFly;
import StrategyPatternDuckApp.AbstractClasses.QuackBehaviour.NoQuacking;
import StrategyPatternDuckApp.AbstractClasses.QuackBehaviour.Quack;
import StrategyPatternDuckApp.Clients.Duck;
import StrategyPatternDuckApp.Clients.Hunter;
import StrategyPatternDuckApp.Ducks.MallardDuck;
import StrategyPatternDuckApp.Ducks.ModelDuck;
import StrategyPatternDuckApp.Ducks.TestDuck;


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
