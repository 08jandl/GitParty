package Party;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        System.out.println("I have always planned birthday parties for my kids so I am going to try to plan one using Java.");

        //First, let us provide the details of the Party
        Scanner celebrant = new Scanner(System.in);
        System.out.println("Who's going to celebrate his birthday? ");
        // TODO: you should use the result of your scanner
        String celebrantName = celebrant.nextLine();

        Scanner when = new Scanner(System.in);
        System.out.println("When is the party? ");
        String partyDate = when.nextLine();

        Scanner place = new Scanner(System.in);
        System.out.println("Where is the party? ");
        String partyVenue = place.nextLine();

        Scanner time = new Scanner(System.in);
        System.out.println("What time is the party? ");
        String partyTime = time.nextLine();

        // TODO: the comment no longer reflects what you coded ;)
        //Now we are going to invite 11 kids to the party.
        int guests = 0;

        for (int i = 0; i < 5; i++) {
            Scanner guest = new Scanner(System.in);
            System.out.println("Guest" + guests + ": ");
            // TODO: you are not using your scanner here either
            String guestName = guest.nextLine();
            guests = guests + 1;
        }

        System.out.println("Total number of guests: " + guests);

        if (guests==5) {
            System.out.println("We have enough number of guests! Don't Give out anymore invitations");
        }
        //Do we have all the things we need for the party:
        String basicPartyScenario;
        String completePartyScenario;

        basicPartyScenario = "We have the basics.";
        boolean cake;
        boolean candles;
        boolean drinks;

        completePartyScenario = "We have everything we need and more!";
        boolean frenchFries;
        boolean chickenNuggets;
        boolean spaghetti;
        boolean fruits;
        boolean burger;
        boolean balloons;
        boolean confetti;

        cake = true;
        drinks = true;
        frenchFries = true;
        chickenNuggets = false;
        fruits = false;
        spaghetti = false;
        burger = true;
        balloons = true;
        candles = true;
        confetti = false;

        //Are  we ready for the party. Do we have the essentials?
        // TODO: these long logical equations can also be stored in variables, then you could reuse them & give them a name that makes it easier to read
        if (cake && drinks && frenchFries && chickenNuggets && fruits && spaghetti && burger && balloons && candles && confetti) {
            System.out.println(completePartyScenario + " We can party!!!");
        } else if ((cake && candles) && drinks && (frenchFries || fruits) && (chickenNuggets || burger || spaghetti) || (balloons || confetti)) {
            System.out.println(basicPartyScenario + "We can party!");
        } else {
            System.out.println("Not ready! You need to double check your checklist!");
        }

        //Create and use at least 1 method
        System.out.println("--------------------------------------------------------------------------");
        String partyScenario = "We have most of the things we need! we can Party!";
        simplePartyScenario(partyScenario, cake, frenchFries, chickenNuggets, fruits, spaghetti, burger, balloons, candles, confetti, drinks);


        //Reassigning variables to use a second time
        System.out.println("--------------------------------------------------------------------------");
        cake = false;
        drinks = true;
        frenchFries = true;
        chickenNuggets = false;
        fruits = false;
        spaghetti = false;
        burger = true;
        balloons = true;
        candles = true;
        confetti = false;

        //Re-use at least 1 method
        String partyScenario2 = "We have most of the things we need! we can Party!";
        simplePartyScenario(partyScenario2, cake, frenchFries, chickenNuggets, fruits, spaghetti, burger, balloons, candles, confetti, drinks);


    }

    private static void simplePartyScenario(String partyScenario, boolean cake, boolean frenchFries, boolean chickenNuggets, boolean fruits, boolean spaghetti, boolean burger, boolean balloons, boolean candles, boolean confetti, boolean drinks) {
        if ((cake && drinks) && ((frenchFries || chickenNuggets) || (fruits && spaghetti || burger)) && (balloons || candles || confetti)) {
            System.out.println(partyScenario);
        }
        else {
            System.out.println("No Party! You need to prepare more!");
        }
    }
}