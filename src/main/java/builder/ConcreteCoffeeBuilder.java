package builder;

public class ConcreteCoffeeBuilder implements CoffeeBuilder {

    private Coffee coffee;


    public ConcreteCoffeeBuilder() {
        this.coffee = new Coffee();
    }

    @Override
    public Coffee getCoffee() {
        return this.coffee;
    }

    @Override
    public void addWater() {
        coffee.setWater(100);
    }

    @Override
    public void addCoffeeBeans() {
        coffee.setCoffeeBeans(10);
    }

    @Override
    public void addMilk() {
        coffee.setMilk(50);
    }

    @Override
    public void addCacao() {
        coffee.setCacao(10);
    }
}