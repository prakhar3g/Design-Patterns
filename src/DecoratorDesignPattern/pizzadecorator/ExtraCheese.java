package DecoratorDesignPattern.pizzadecorator;

import DecoratorDesignPattern.basepizza.BasePizza;

public class ExtraCheese extends ToppingsDecorator{

    public ExtraCheese(BasePizza basePizza) {
        super(basePizza);
    }

    @Override
    public int cost() {
        return basePizza.cost()+20;
    }
}
