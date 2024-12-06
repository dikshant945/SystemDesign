package DecoratorsPatternWithStarbuzzCafe.Condiments;

import DecoratorsPatternWithStarbuzzCafe.AbstractClasses.Beverage;
import DecoratorsPatternWithStarbuzzCafe.AbstractClasses.CondimentDecorator;
import DecoratorsPatternWithStarbuzzCafe.Enums.Size;

import java.util.HashMap;
import java.util.Map;

public class Soy extends CondimentDecorator {

    private static Size size;

    private static final Map<Size,Double> costBySize;
    static {
        costBySize = new HashMap<>();
        costBySize.put(size.SMALL,0.10);
        costBySize.put(size.MEDIUM,0.15);
        costBySize.put(size.LARGE,0.20);
    };

    public Soy(Beverage b){
        beverage = b;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Soy";
    }

    @Override
    public double cost() {
        return beverage.cost() + costBySize.get(beverage.getSize()) ;
    }
}
