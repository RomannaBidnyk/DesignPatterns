package creational.abstractfactory;

public class SecondHandCarFactory implements AbstractCarFactory {
    @Override
    public Ferrari getFerrari() {
        return new SecondHandFerrari();
    }

    @Override
    public RangeRover getRangeRover() {
        return new SecondHandRangeRover();
    }
}
