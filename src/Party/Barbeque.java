package Party;

public class Barbeque {
    public static void main(String[] args) {
        String guest = "Nora";
        boolean isCorn = true;
        boolean isFriedChicken = false;
        int corn = 2;

        if (isCorn && corn >= 2 || isFriedChicken) {
            System.out.println(guest + " is happy. :)");
        } else {
            System.out.println(guest + " is sad. :(");
        }
        int corn2 = 4;
toMuchCorn(corn2);

    }

    public static void toMuchCorn(int corn2) {

        String guest2 = "Nora's mom";
        if (corn2 >= 5) {

            System.out.println(guest2 + " gets bloated.");
        } else {
            System.out.println(guest2 + " should stop eating grilled corn.");
        }

    }
}