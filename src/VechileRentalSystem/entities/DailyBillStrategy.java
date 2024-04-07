package VechileRentalSystem.entities;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class DailyBillStrategy implements BillStrategy{

    private BigDecimal dailyCost = BigDecimal.valueOf(1000);

    @Override
    public BigDecimal calculateCost(LocalDateTime pickupTime, LocalDateTime dropTime) {
        Duration duration = Duration.between(pickupTime,dropTime);
        Long days = duration.toDays();
        BigDecimal cost = BigDecimal.valueOf(days).multiply(dailyCost);
        return cost;
    }
}
