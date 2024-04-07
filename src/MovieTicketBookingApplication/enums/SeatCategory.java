package MovieTicketBookingApplication.enums;

import java.math.BigDecimal;

public enum SeatCategory {
    SILVER(BigDecimal.valueOf(100)),
    GOLD(BigDecimal.valueOf(150)),
    PLATINUM(BigDecimal.valueOf(200));

    private BigDecimal price;

    SeatCategory(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
