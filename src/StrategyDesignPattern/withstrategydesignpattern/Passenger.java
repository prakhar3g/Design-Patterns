package StrategyDesignPattern.withstrategydesignpattern;

import StrategyDesignPattern.withstrategydesignpattern.Strategy.NormalDriveStrategy;

public class Passenger extends Vehicle {

    public Passenger() {
        super(new NormalDriveStrategy());
    }
}
