package creational.factorymethod;

public class ToysFactory {

    public AbstractToy getToy(String toyName) {
        if (toyName == null) {
            return null;
        }
        if (toyName.equalsIgnoreCase("Dog")) {
            return new Dog();

        } else if (toyName.equalsIgnoreCase("Cat")) {
            return new Cat();
        }
        return null;
    }
}