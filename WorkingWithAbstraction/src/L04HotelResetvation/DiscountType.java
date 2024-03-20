package L04HotelResetvation;

public enum DiscountType {
    VIP("VIP", 20),
    SecondVisit("Second Visit", 10),
    None("None", 0);

    private final String name;
    private final int percentage;

    DiscountType(String name, int percentage){
        this.name = name;
        this.percentage = percentage;
    }

    public String getName(){
        return this.name;
    }

    public int getPercentage(){
        return this.percentage;
    }
}
