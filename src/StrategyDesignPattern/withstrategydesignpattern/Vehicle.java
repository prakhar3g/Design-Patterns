package StrategyDesignPattern.withstrategydesignpattern;

import StrategyDesignPattern.withstrategydesignpattern.Strategy.DriveStrategy;

public class Vehicle {

    private DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy=driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
