package StrategyDesignPattern.withstrategydesignpattern;

import StrategyDesignPattern.withstrategydesignpattern.Strategy.SpecialDriveStrategy;

public class OffRoad extends Vehicle {

    public OffRoad() {
        super(new SpecialDriveStrategy());
    }

}
