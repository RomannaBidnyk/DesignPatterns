package singleton.unsafe;

public class President {

    private static President PRESIDENT_INSTANCE;
    public String presidentOfCountry;

    private President(String presidentOfCountry) {
        this.presidentOfCountry = presidentOfCountry;
        System.out.println("President of country " + presidentOfCountry + " is created");
    }

    public static President getPresidentInstance(String presidentOfCountry) {
        if (PRESIDENT_INSTANCE == null || PRESIDENT_INSTANCE.presidentOfCountry != presidentOfCountry) {
            PRESIDENT_INSTANCE = new President(presidentOfCountry);
        }
        return PRESIDENT_INSTANCE;
    }
}