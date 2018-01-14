package creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        ToysFactory toysFactory = new ToysFactory();

        AbstractToy toyDog = toysFactory.getToy("Dog");
        toyDog.playWithToy();

        AbstractToy toyCat = toysFactory.getToy("Cat");
        toyCat.playWithToy();
    }
}