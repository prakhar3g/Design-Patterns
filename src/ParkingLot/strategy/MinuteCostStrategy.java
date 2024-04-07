package ParkingLot.strategy;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class MinuteCostStrategy implements CostStrategy{

    BigDecimal costPerHour = BigDecimal.valueOf(100);

    @Override
    public BigDecimal getCost(LocalDateTime exitTime, LocalDateTime entryTime) {
        Duration duration = Duration.between(entryTime,exitTime);
        Long minutes = duration.toMinutes();
        BigDecimal cost = BigDecimal.valueOf(minutes).multiply(costPerHour);
        return cost;
    }
}
