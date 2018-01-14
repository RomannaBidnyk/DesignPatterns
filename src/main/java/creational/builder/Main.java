package creational.builder;

public class Main {

    public static void main(String[] args) {
        CoffeeBuilder coffeBuilder = new ConcreteCoffeeBuilder();
        CoffeeMaker coffeeMaker = new CoffeeMaker(coffeBuilder);
        coffeeMaker.createLatterCoffee();
        Coffee latte = coffeeMaker.getCoffee();
        System.out.println("Latte");
        System.out.println(latte.water);
        System.out.println(latte.coffeeBeans);
        System.out.println(latte.milk);
        System.out.println(latte.cacao);

        coffeeMaker.createMoccoCoffee();
        Coffee mocco = coffeeMaker.getCoffee();
        System.out.println("Mocco");
        System.out.println(latte.water);
        System.out.println(latte.coffeeBeans);
        System.out.println(latte.milk);
        System.out.println(latte.cacao);
    }
}