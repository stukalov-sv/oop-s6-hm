public class Main {
    public static void main(String[] args) {
                
        CoffeeBuilder cb = new MilkCoffeeBuilder();

        cb.setCoffee("Молотый кофе");
        cb.setWater("Вода");
        cb.setSugar("Сахар");

        cb.boilWater();
        
        ((MilkCoffeeBuilder) cb).setMilk("milk");

        Coffee coffee = ((MilkCoffeeBuilder) cb).buildMilkCoffee();

        System.out.println(coffee);
    }
}
