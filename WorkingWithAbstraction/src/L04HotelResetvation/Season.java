package L04HotelResetvation;

public enum Season {
    Autumn("Autumn", 1),
    Spring("Spring", 2),
    Winter("Winter", 3),
    Summer("Summer", 4);

    private final String name;
    private final int priceMultiplier;

    Season(String name, int priceMultiplier){
        this.name = name;
        this.priceMultiplier = priceMultiplier;
    }

    public String getName(){
        return this.name;
    }

    public int getPriceMultiplier(){
        return this.priceMultiplier;
    }
}
