package creational.builder.builder2;

public class Main {

    public static void main(String[] args) {
        CoffeeBuilder coffeeBuilder = new ConcreteCoffeeBuilder();
        CoffeeMaker coffeeMaker = new CoffeeMaker(coffeeBuilder);
        Coffee coffee = coffeeMaker
                .createCoffee()
                .addWater(100)
                .addCoffeeBeans(10)
                .addCacao(500)
                .build();
        System.out.print(coffee);

    }
}