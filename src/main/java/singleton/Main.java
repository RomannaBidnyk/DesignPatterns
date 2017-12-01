package singleton;

public class Main {
    public static void main(String[] args) {
        President.getPresidentInstance();
        System.out.println("11111111111");
        President.getPresidentInstance();
        System.out.println("22222222222");
        President.getPresidentInstance();
        System.out.println("33333333333");
    }
}