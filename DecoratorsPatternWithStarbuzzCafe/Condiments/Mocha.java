package DecoratorsPatternWithStarbuzzCafe.Condiments;

import DecoratorsPatternWithStarbuzzCafe.AbstractClasses.Beverage;
import DecoratorsPatternWithStarbuzzCafe.AbstractClasses.CondimentDecorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage b){
        beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.description + " Mocha";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.20;
    }
}
