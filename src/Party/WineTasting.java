package Party;

public class WineTasting {
    public static void main(String[] args) {
        //Why I did choose the party
        System.out.println("I chose the wine party because after programming I need some relaxing activities such wine tasting ");

        //meaningful names and data types for variables
        // TODO: great variety of variables!
        String wineBrand;
        int BottleAge = 10;
        boolean tasty;
        boolean old;
        boolean red;
        boolean white;

        // variables initialization
        wineBrand = "Pinot";
        tasty = true;
        old = true;
        red = true;
        white = true;

        // Logical equation using variables
        tasty = old && (red || white);

        //Method creation and reuse
        chooseBestWine(wineBrand, BottleAge, tasty);

        // Variables reassignement
        wineBrand = "cabernet Sauvignon ";
        tasty = false;
        old = false;
        tasty = old && (red || white);

        //Method creation and reuse
        chooseBestWine(wineBrand, BottleAge, tasty);

        // Variables reassignement
        wineBrand = "Bergerac";
        tasty = true;
        old = true;
        tasty = old && (red || white);

        //Method creation and reuse
        chooseBestWine(wineBrand, BottleAge, tasty);

    }

    private static void chooseBestWine(String wineBrand, int bottleAge, boolean tasty) {
        if (tasty) {
            System.out.println("I enjoy " + wineBrand + " with the age of " + bottleAge + ".");
        } else {
            System.out.println(" The" + wineBrand + " is not tasty at all and should be used to cook gulasch." );
        }
    }
}
