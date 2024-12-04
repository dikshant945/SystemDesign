package DecoratorsPatternWithStarbuzzCafe.Beverages;

import DecoratorsPatternWithStarbuzzCafe.AbstractClasses.Beverage;

public class HosueBlend extends Beverage {

    public HosueBlend(){
        description = "House Blend";
    }

    @Override
    public double cost() {
        return 0;
    }
}
