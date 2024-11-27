package StrategyPatternDuckApp.AbstractClasses.QuackBehaviour;

import StrategyPatternDuckApp.Interfaces.QuackBehaviour;

public class Quack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Quacking");
    }
}
