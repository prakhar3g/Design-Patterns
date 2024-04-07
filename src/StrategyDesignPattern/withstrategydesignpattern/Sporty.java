package StrategyDesignPattern.withstrategydesignpattern;

import StrategyDesignPattern.withstrategydesignpattern.Strategy.SpecialDriveStrategy;

public class Sporty extends Vehicle {

    public Sporty() {
        super(new SpecialDriveStrategy());
    }
}
