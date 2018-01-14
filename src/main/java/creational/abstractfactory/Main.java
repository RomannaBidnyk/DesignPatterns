package creational.abstractfactory;

public class Main {

    public static void main(String[] args) {
        AbstractCarFactory newCarFactory = new NewCarFactory();
        Ferrari newFerrari = newCarFactory.getFerrari();
        newFerrari.drive();
        RangeRover newRangeRover = newCarFactory.getRangeRover();
        newRangeRover.drive();

        AbstractCarFactory secondHandCarFactory = new SecondHandCarFactory();
        Ferrari oldFerrari = secondHandCarFactory.getFerrari();
        oldFerrari.drive();
        RangeRover oldRangeRover = secondHandCarFactory.getRangeRover();
        oldRangeRover.drive();
    }
}
