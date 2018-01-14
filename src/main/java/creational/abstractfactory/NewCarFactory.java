package creational.abstractfactory;

public class NewCarFactory implements AbstractCarFactory {

    @Override
    public Ferrari getFerrari() {
        return new NewFerrari();
    }

    @Override
    public RangeRover getRangeRover() {
        return new NewRangeRover();
    }
}
