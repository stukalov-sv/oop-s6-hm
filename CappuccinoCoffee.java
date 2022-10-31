public class CappuccinoCoffee extends Coffee {
    private String milk;

    public CappuccinoCoffee(String coffee, String sugar, String water, String milk) {
        super(coffee, sugar, water);
        this.milk = milk;
    }
    
    public CappuccinoCoffee(Coffee coffee, String milk) {
        super(coffee.getCoffee(), coffee.getSugar(), coffee.getWater());
        this.milk = milk;
    }
    
    @Override
    public String toString() {
        return "Tasty cappuccino";
    }

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }
}