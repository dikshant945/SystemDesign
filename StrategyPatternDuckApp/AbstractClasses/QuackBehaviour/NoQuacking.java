package StrategyPatternDuckApp.AbstractClasses.QuackBehaviour;

import StrategyPatternDuckApp.Interfaces.QuackBehaviour;

public class NoQuacking implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("Cannot Quack");
    }
}
