package StrategyPatternDuckApp.AbstractClasses.FlyBehaviour;

import StrategyPatternDuckApp.Interfaces.FlyBehaviour;

public  class NoFly implements FlyBehaviour {
    @Override
    public void fly() {
        System.out.println("Cannot Fly With Wings");
    }
}
