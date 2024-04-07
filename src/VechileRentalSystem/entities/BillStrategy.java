package VechileRentalSystem.entities;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public interface BillStrategy {
    BigDecimal calculateCost(LocalDateTime pickupTime,LocalDateTime dropTime);
}
