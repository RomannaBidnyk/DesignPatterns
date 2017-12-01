package singleton;

public class President {

    private static final President PRESIDENT_INSTANCE = new President();

    private President() {
        System.out.println("President is created");
    }

    public static President getPresidentInstance() {
        return PRESIDENT_INSTANCE;
    }
}