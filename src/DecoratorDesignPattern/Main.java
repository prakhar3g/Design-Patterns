package DecoratorDesignPattern;

import DecoratorDesignPattern.basepizza.BasePizza;
import DecoratorDesignPattern.basepizza.VeggieDelight;
import DecoratorDesignPattern.pizzadecorator.ExtraCheese;
import DecoratorDesignPattern.pizzadecorator.Mushroom;

public class Main {

    public static void main(String[] args) {
        BasePizza basePizza = new ExtraCheese(new Mushroom(new VeggieDelight()));
        System.out.println(basePizza.cost());
    }
}
