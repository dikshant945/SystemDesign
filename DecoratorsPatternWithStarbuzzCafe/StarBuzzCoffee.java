package DecoratorsPatternWithStarbuzzCafe;

import DecoratorsPatternWithStarbuzzCafe.AbstractClasses.Beverage;
import DecoratorsPatternWithStarbuzzCafe.Beverages.DarkRoast;
import DecoratorsPatternWithStarbuzzCafe.Condiments.Mocha;
import DecoratorsPatternWithStarbuzzCafe.Condiments.Soy;
import DecoratorsPatternWithStarbuzzCafe.Condiments.SteamedMilk;
import DecoratorsPatternWithStarbuzzCafe.Condiments.Whip;

public class StarBuzzCoffee {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();

        darkRoast = new Soy(darkRoast);
        darkRoast = new Whip(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new SteamedMilk(darkRoast);

        double cost = darkRoast.cost();
        String description = darkRoast.getDescription();

        System.out.println(description + " " + cost);

    }
}
