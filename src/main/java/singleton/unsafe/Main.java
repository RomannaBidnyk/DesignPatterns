package singleton.unsafe;

public class Main {
    public static void main(String[] args) {
        President.getPresidentInstance("USA");
        System.out.println("11111111111");
        President.getPresidentInstance("Canada");
        System.out.println("22222222222");
        President.getPresidentInstance("Ukraine");
        System.out.println("33333333333");
    }
}