package VechileRentalSystem.entities;

import java.math.BigDecimal;
import java.time.Duration;
import java.time.LocalDateTime;

public class HourlyBillStrategy implements BillStrategy{

    private BigDecimal costPerHour=BigDecimal.valueOf(200);

    @Override
    public BigDecimal calculateCost(LocalDateTime pickupTime, LocalDateTime dropTime) {
        Duration duration = Duration.between(pickupTime,dropTime);
        Long hours = duration.toHours();
        BigDecimal cost = BigDecimal.valueOf(hours).multiply(costPerHour);
        return cost;
    }
}
