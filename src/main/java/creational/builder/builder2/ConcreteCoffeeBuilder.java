package creational.builder.builder2;

public class ConcreteCoffeeBuilder implements CoffeeBuilder {

    private Coffee coffee;


    public ConcreteCoffeeBuilder() {
        this.coffee = new Coffee();
    }

    @Override
    public ConcreteCoffeeBuilder addWater(int water) {
        coffee.setWater(water);
        return this;
    }

    @Override
    public ConcreteCoffeeBuilder addCoffeeBeans(int coffeeBeans) {
        coffee.setCoffeeBeans(coffeeBeans);
        return this;
    }

    @Override
    public ConcreteCoffeeBuilder addMilk(int milk) {
        coffee.setMilk(milk);
        return this;
    }

    @Override
    public ConcreteCoffeeBuilder addCacao(int cacao) {
        coffee.setCacao(cacao);
        return this;
    }

    @Override
    public Coffee build(){
        return this.coffee;
    }

}