public class MochaccinoCoffeeBuilder extends CappuccinoCoffeeBuilder {
    private String chocolate;

    public String getChocolate() {
        return chocolate;
    }

    public void setChocolate(String chocolate) {
        this.chocolate = chocolate;
    }
    
    public Coffee buildMochaccino() {
        System.out.println("Add chocolate");
        return new MochaccinoCoffee((CappuccinoCoffee) buildCappuccino(), chocolate);
    }

}
