package Party;

public class ChristmasParty {
    public static void main(String[] args) {

        // 1) Tell us why you chose that party
        System.out.println("I chose the Christmas-party because I always remember the cozy feeling from our family christmas celebrations.");


        // 2) Declare variables with meaningful names and appropriate data types
        String songTitle;
        String songWriter;
        boolean atmospheric;


        String present;
        boolean useful;
        boolean joke;

        String christmasOrnaments;
        boolean beautiful;
        boolean straw;
        boolean kitschy;

        // 3) initialize your variables
        songTitle = "Stille Nacht";
        songWriter = "Joseph Mohr und Anselm Kreuzer";
        beautiful = true;
        atmospheric = true;

        present = "book about history";
        useful = true;
        joke = false;

        christmasOrnaments = "Strawstars";
        straw = true;
        kitschy = false;
        beautiful = true;


        // 4) create at least 1 logical equation using your variables
        boolean niceOrnaments = (beautiful && straw) && !kitschy;

        boolean thoughtfulPresent = useful  && !joke;

        boolean festiveAtmosphere = (atmospheric || beautiful) && !kitschy || joke;


        // 5) optional: create and re)-use at least 1 method

        familyHappy(christmasOrnaments, niceOrnaments);

        // 6) make sure your code runs
        // 7) push your changes

    }

    public static void familyHappy(String christmasOrnaments, boolean niceOrnaments) {

        if (niceOrnaments) {
            System.out.println("A christmas party is festive, if there are " + christmasOrnaments + ".");
        } else {
            System.out.println("A christmas party is not festive if there are no " + christmasOrnaments);
        }

    }
}

