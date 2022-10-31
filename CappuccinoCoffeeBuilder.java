public class CappuccinoCoffeeBuilder extends CoffeeBuilder {
    private String milk;

    public String getMilk() {
        return milk;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }
    
    public void boilMilk() {
        System.out.println("Milk is boiled");
    }
    
    public Coffee buildCappuccino() {
        System.out.println("Add lather milk");
        return new CappuccinoCoffee(buildCoffee(), milk);
    }
}
