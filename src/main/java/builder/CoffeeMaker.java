package builder;

public class CoffeeMaker {

    private CoffeeBuilder coffeeBuilder;

    public CoffeeMaker(CoffeeBuilder coffeeBuilder){
        this.coffeeBuilder = coffeeBuilder;
    }

    public Coffee getCoffee(){
        return this.coffeeBuilder.getCoffee();
    }

    public void createLatterCoffee(){
        this.coffeeBuilder.addCoffeeBeans();
        this.coffeeBuilder.addWater();
        this.coffeeBuilder.addMilk();
    }

    public void createMoccoCoffee(){
        this.coffeeBuilder.addCoffeeBeans();
        this.coffeeBuilder.addWater();
        this.coffeeBuilder.addMilk();
        this.coffeeBuilder.addCacao();
    }
}