package DecoratorDesignPattern.pizzadecorator;

import DecoratorDesignPattern.basepizza.BasePizza;

public class Mushroom extends ToppingsDecorator {

    public Mushroom(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int cost() {
        return basePizza.cost() + 10;
    }

}
