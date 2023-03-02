package Party;

public class PoolParty {
    public static void main(String[] args) {
        System.out.println("I chose this party because I like summer.");

        String pool;
        String watter;
        boolean cold;
        String warm;


        cold = true;
        pool = "big pool";
        watter = "salty watter";
        warm = "verry warm";

watter = String.valueOf(!cold);

swimming( pool, watter, cold, warm);

        cold = false;
        pool = "small pool";
        watter = " dirrty watter";
        warm = " to warm";

        swimming( pool, watter, cold, warm);

    }
    private static void  swimming (String pool, String watter, boolean cold, String warm) {
        if (cold) {
            System.out.println("Swimming in the " + pool + " is enjoyable if the " + watter + " is " + warm + ".");
        } else {
            System.out.println("Swimming in the " + pool + " is not enjoyable if the " + watter + " is cold.");
        }


} }


