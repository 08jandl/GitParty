package Party;

public class MovieNight {
    public static void main(String[] args) {
        //Tell us why you chose that party
        System.out.println("I chose this party because I love watching movies.");
        //Declare variables with meaningful names and appropriate data types

        String movieTitle;
        int movieLength;

        boolean snacks;
        boolean drinks;
        boolean fun;
        boolean bathroomBreak;

        boolean goodTime;
        boolean tooLong;




        //Initialize your variables

        movieTitle = "The Shining";
        movieLength = 119;
        snacks = true;
        drinks = false;
        fun = true;
        bathroomBreak = true;



        //Create at least 1 logical equation using your variables

      goodTime = fun && (drinks || snacks);




        //Create and (re)-use at least 1 method
        printMovieNightSuccess(movieTitle, goodTime);
        printMovieTooLong(movieLength);
        printBathroomBreak(bathroomBreak);


        //Reassigning variables to use a second time
        movieTitle = "Lord of the Rings Marathon";
        movieLength = 6720;
        snacks= true;
        drinks= true;
        fun= true;
        bathroomBreak = false;

        goodTime = fun && (drinks || snacks);

        //Create and (re)-use at least 1 method
        printMovieNightSuccess(movieTitle, goodTime);
        printMovieTooLong(movieLength);
        printBathroomBreak(bathroomBreak);

        //Reassigning variables to use a third time
        movieTitle = "Zack Snyder's Justice League";
        movieLength = 242;
        snacks= true;
        drinks= true;
        fun= false;
        bathroomBreak = true;

        goodTime = fun && (drinks || snacks);

        //Create and (re)-use at least 1 method
        printMovieNightSuccess(movieTitle, goodTime);
        printMovieTooLong(movieLength);
        printBathroomBreak(bathroomBreak);


    }

    private static void printMovieNightSuccess(String movieTitle, boolean goodTime) {

        if (goodTime) {
            System.out.println("I enjoyed " + movieTitle + ".");
        } else {
            System.out.println("I didn't enjoy " + movieTitle + ".");
        }
    }

    private static void printMovieTooLong(int movieLength) {
        boolean tooLong = (movieLength >= 180);
        if (tooLong) {
            System.out.println("The movie was " + movieLength + "minutes long.");
        } else {
            System.out.println("The movie was " + movieLength + "minutes long.");
        }
    }
    private static void printBathroomBreak(boolean bathroomBreak) {
        boolean notGood = (bathroomBreak != true);
        if (notGood) {
            System.out.println("That's too long without a bathroom break.");
        } else {
            System.out.println("That's fine without a bathroom break.");
        }
    }

}
