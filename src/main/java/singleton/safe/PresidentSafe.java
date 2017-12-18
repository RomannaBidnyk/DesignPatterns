package singleton.safe;

//Double Checked Locking & volatile

public class PresidentSafe {
    private static volatile PresidentSafe PRESIDENT_INSTANCE;

    private PresidentSafe() {
        System.out.println("President is created");
    }

    public static PresidentSafe getPresidentInstance() {
        PresidentSafe localInstancePresident = PRESIDENT_INSTANCE;
        if (localInstancePresident == null) {
            synchronized (PresidentSafe.class) {
                localInstancePresident = PRESIDENT_INSTANCE;
                if (localInstancePresident == null) {
                    PRESIDENT_INSTANCE = localInstancePresident = new PresidentSafe();
                }
            }
        }
        return localInstancePresident;
    }
}