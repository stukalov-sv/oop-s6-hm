public class Main {
    public static void main(String[] args) {
                
        CoffeeBuilder cb1 = new MilkCoffeeBuilder();

        cb1.setCoffee("Молотый кофе");
        cb1.setWater("Вода");
        cb1.setSugar("Сахар");

        cb1.boilWater();

        System.out.println(cb1.buildCoffee());
        System.out.println();
        
        ((MilkCoffeeBuilder) cb1).setMilk("milk");
        Coffee milkCoffee = ((MilkCoffeeBuilder) cb1).buildMilkCoffee();

        System.out.println(milkCoffee);
        System.out.println();

        CoffeeBuilder cb2 = new CappuccinoCoffeeBuilder();

        cb2.setCoffee("Молотый кофе");
        cb2.setWater("Вода");
        cb2.setSugar("Сахар");
        
        cb2.boilWater();

        ((CappuccinoCoffeeBuilder) cb2).boilMilk();

        Coffee cappuccinoCoffee = ((CappuccinoCoffeeBuilder) cb2).buildCappuccino();
        System.out.println(cappuccinoCoffee);
        System.out.println();

        CoffeeBuilder cb3 = new MochaccinoCoffeeBuilder();

        cb3.setCoffee("Молотый кофе");
        cb3.setWater("Вода");
        cb3.setSugar("Сахар");
        
        cb3.boilWater();

        ((CappuccinoCoffeeBuilder) cb3).boilMilk();

        Coffee mochaccinoCoffee = ((MochaccinoCoffeeBuilder) cb3).buildMochaccino();
        System.out.println(mochaccinoCoffee);
        System.out.println();

    }
}
