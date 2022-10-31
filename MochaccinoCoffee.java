public class MochaccinoCoffee extends CappuccinoCoffee {
    private String chocolate;

    public MochaccinoCoffee(String coffee, String sugar, String water, String milk, String chocolate) {
        super(coffee, sugar, water, milk);
        this.chocolate = chocolate;
    }
    
    public MochaccinoCoffee(CappuccinoCoffee coffee, String chocolate) {
        super(coffee.getCoffee(), coffee.getSugar(), coffee.getWater(), coffee.getMilk());
        this.chocolate = chocolate;
    }
    
    @Override
    public String toString() {
        return "Tasty mochaccino";
    }
}