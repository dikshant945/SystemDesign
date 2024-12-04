package DecoratorsPatternWithStarbuzzCafe.Condiments;

import DecoratorsPatternWithStarbuzzCafe.AbstractClasses.Beverage;
import DecoratorsPatternWithStarbuzzCafe.AbstractClasses.CondimentDecorator;

public class SteamedMilk extends CondimentDecorator {

    public SteamedMilk(Beverage b) {
        beverage = b;
    }

    @Override
    public String getDescription() {
        return  beverage.getDescription() +  "Steamed Milk";
    }

    @Override
    public double cost() {
        return beverage.cost() + 0.12;
    }
}
