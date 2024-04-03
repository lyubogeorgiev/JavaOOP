package L03Animals;

public abstract class Animal {
    private String name;
    private String favouriteFood;

    public Animal(String name, String favouriteFood) {
        this.setName(name);
        this.setFavouriteFood(favouriteFood);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getName() {
        return this.name;
    }

    public String getFavouriteFood() {
        return this.favouriteFood;
    }

    @Override
    public String toString() {
        return String.format("I am %s and my favourite food is %s",
                this.getName(),
                this.getFavouriteFood());
    }

    abstract String explainSelf();
}
