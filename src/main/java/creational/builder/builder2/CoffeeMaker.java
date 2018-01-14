package creational.builder.builder2;

public class CoffeeMaker {

    private CoffeeBuilder coffeeBuilder;

    public CoffeeMaker(CoffeeBuilder coffeeBuilder){
        this.coffeeBuilder = coffeeBuilder;
    }

    public CoffeeBuilder createCoffee(){
        return this.coffeeBuilder;
    }

    public CoffeeBuilder createLatterCoffee(){
        this.coffeeBuilder
                .addCoffeeBeans(100)
                .addWater(200)
                .addMilk(50);
        return this.coffeeBuilder;
    }

    public CoffeeBuilder createMoccoCoffee(){
        this.coffeeBuilder
                .addCoffeeBeans(100)
                .addWater(200)
                .addMilk(50)
                .addCacao(30);
        return this.coffeeBuilder;
    }
}