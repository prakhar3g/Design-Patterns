package ParkingLot.strategy;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface CostStrategy {

    public BigDecimal getCost(LocalDateTime exitTime, LocalDateTime entryTime);
}
