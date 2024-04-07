package DecoratorDesignPattern.pizzadecorator;

import DecoratorDesignPattern.basepizza.BasePizza;

public class ToppingsDecorator implements BasePizza {

    protected BasePizza basePizza;

    public ToppingsDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }


    @Override
    public int cost() {
        return basePizza.cost();
    }
}
