public class MilkCoffeeBuilder extends CoffeeBuilder {
    private String milk;

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }
    
    public Coffee buildMilkCoffee() {
        System.out.println("Add milk");
        return new MilkCoffee(buildCoffee(), milk);
    }
    
}
