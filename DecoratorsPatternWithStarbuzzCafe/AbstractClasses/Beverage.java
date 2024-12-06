package DecoratorsPatternWithStarbuzzCafe.AbstractClasses;

import DecoratorsPatternWithStarbuzzCafe.Enums.Size;

public abstract class Beverage {
    public String description = "";
    public Size size ;

    public Size getSize() {
        return size;
    }

    public void setSize(String size) {
        if(size.equals("small")){
            this.size = Size.SMALL;
        } else if (size.equals("medium")) {
            this.size = Size.MEDIUM;
        }else{
            this.size = Size.LARGE;
        }
    }

    public String getDescription() {
        return description;
    }


    public abstract double cost();
}
