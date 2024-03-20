package L04HotelResetvation;

public class PriceCalculator {
    private final double pricePerDay;
    private final int number_of_days;
    private final Season season;
    private final DiscountType discountType;

    public PriceCalculator(double pricePerDay, int number_of_days, Season season, DiscountType discountType) {
        this.pricePerDay = pricePerDay;
        this.number_of_days = number_of_days;
        this.season = season;
        this.discountType = discountType;
    }

    public double calculatePrice() {
        return this.pricePerDay
                * number_of_days
                * season.getPriceMultiplier()
                * ((double) (100 - discountType.getPercentage()) / 100);
    }
}
