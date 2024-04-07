package ParkingLot.strategy;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class HourlyCostStrategy implements CostStrategy{

    BigDecimal costPerHour = BigDecimal.valueOf(100);

    @Override
    public BigDecimal getCost(LocalDateTime exitTime, LocalDateTime entryTime) {
        Duration duration = Duration.between(entryTime,exitTime);
        Long hours = duration.toHours();
        if (hours==0)
            hours = Long.valueOf(1);
        BigDecimal cost = BigDecimal.valueOf(hours).multiply(costPerHour);
        return cost;
    }
}
