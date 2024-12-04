package DecoratorsPatternWithStarbuzzCafe.Condiments;

import DecoratorsPatternWithStarbuzzCafe.AbstractClasses.Beverage;
import DecoratorsPatternWithStarbuzzCafe.AbstractClasses.CondimentDecorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage b){
        beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+ " Whip";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.10;
    }
}
