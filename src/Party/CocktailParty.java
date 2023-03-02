package Party;

public class CocktailParty {
    public static void main(String[] args) {
        //Tell us why you chose that party
        System.out.println("I choose this party, because I like Cocktails.");

        //Declare variables with meaningful names and appropriate data types
        String cocktailName;
        String alcohol;
        // TODO: What do low, medium and high stand for? Perhaps you could rename them or use them in a way that makes clear what they are?
        boolean low;
        boolean medium;
        boolean high;
        boolean cool;
        boolean goodCocktail;

        //Initialize your variables
        cocktailName = "Mojito";
        alcohol = "wenig";
        low = true;
        medium = false;
        high = false;
        cool = true;

        //Create at least 1 logical equation using your variables
        goodCocktail = (low || high || medium) && cool;

        //Create and (re)-use at least 1 method
        cocktailResult(cocktailName, alcohol, goodCocktail);

        //Reassigning variables to use a second time
        cocktailName = "Tequila Sunrise";
        alcohol = "mehr";
        low = false;
        medium = true;
        high = false;
        cool = true;
        goodCocktail = (low || high || medium) && cool;

        //Create and (re)-use at least 1 method
        cocktailResult(cocktailName, alcohol, goodCocktail);

        //Reassigning variables to use a second time
        cocktailName = "Long Island Ice Tee";
        alcohol = "viel";
        low = false;
        medium = false;
        high = true;
        cool = false;
        goodCocktail = (low || high || medium) && cool;

        //Create and (re)-use at least 1 method
        cocktailResult(cocktailName, alcohol, goodCocktail);
    }

    //Create and (re)-use at least 1 method
    private static void cocktailResult(String cocktailName, String alcohol, boolean goodCocktail)

    {
        if (goodCocktail) {
            System.out.println("I like " + cocktailName + " mit " + alcohol + " alcohol.");
        } else {
            System.out.println("I did't like this Cocktail: " + cocktailName + ".");
        }
    }


}
