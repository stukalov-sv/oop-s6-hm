public class CoffeeBuilder {
    private Coffee coffee;
    private String water;
    private String sugar;
    private String coffeeType;

    public Coffee buildCoffee() {
        return new Coffee(coffeeType, sugar, water);
    }

    public void setCoffee(String string) {
        this.coffeeType = string;
    }

    public void setWater(String string) {
        this.water = string;
    }

    public void setSugar(String string) {
        this.sugar = string;
    }

    public void boilWater() {
        System.out.println("Water is boiled");
    }

}