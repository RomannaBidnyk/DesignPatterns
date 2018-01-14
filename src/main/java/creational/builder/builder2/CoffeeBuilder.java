package creational.builder.builder2;

public interface CoffeeBuilder {


    public ConcreteCoffeeBuilder addWater(int water);

    public ConcreteCoffeeBuilder addCoffeeBeans(int coffeeBeans);

    public ConcreteCoffeeBuilder addMilk(int milk);

    public ConcreteCoffeeBuilder addCacao(int cacao);

    public Coffee build();
}
