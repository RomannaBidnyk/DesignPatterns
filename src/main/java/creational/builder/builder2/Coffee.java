package creational.builder.builder2;

public class Coffee implements CoffeeIngredients {
    int water;
    int coffeeBeans;
    int milk;
    int cacao;

    @Override
    public void setWater(int water) {
        this.water = water;
    }

    public int getWater() {
        return water;
    }

    @Override
    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }

    public int getCoffeeBeans() {
        return coffeeBeans;
    }

    @Override
    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getMilk() {
        return milk;
    }

    @Override
    public void setCacao(int cacao) {
        this.cacao = cacao;
    }

    public int getCacao() {
        return cacao;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "water=" + water +
                ", coffeeBeans=" + coffeeBeans +
                ", milk=" + milk +
                ", cacao=" + cacao +
                '}';
    }
}