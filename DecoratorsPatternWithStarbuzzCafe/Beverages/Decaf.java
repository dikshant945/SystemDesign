package DecoratorsPatternWithStarbuzzCafe.Beverages;

import DecoratorsPatternWithStarbuzzCafe.AbstractClasses.Beverage;

public class Decaf extends Beverage {

    public Decaf(){
        description = "Hey Decaf !";
    }

    @Override
    public double cost() {
        return 1.11;
    }
}
