package Party;

import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        System.out.println("I have always planned birthday parties for my kids so I am going to try to plan one using Java.");

        //First, let us provide the details of the Party
        Scanner celebrant = new Scanner(System.in);
        System.out.println("Who's going to celebrate his birthday? ");
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

        //Now we are going to invite 11 kids to the party.
        int guests = 1;
        if (guests < 6) {
            for (int i = 1; i < 5; i++) {
                Scanner guest = new Scanner(System.in);
                System.out.println("Guest" + guests + ": ");
                String guestName = guest.nextLine();
                guests = guests + 1;
            }


        }
        System.out.println("Total number of guests: " + guests);
        System.out.println("We have enough number of guests! Don't Give out anymore invitations");

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
        if (cake && drinks && frenchFries && chickenNuggets && fruits && spaghetti && burger && balloons && candles && confetti) {
            System.out.println(completePartyScenario + " We can party!!!");
        } else if ((cake && candles) && drinks && (frenchFries || fruits) && (chickenNuggets || burger || spaghetti) || (balloons || confetti)) {
            System.out.println(basicPartyScenario + "We can party!");
        } else {
            System.out.println("Not ready! You need to double check your checklist!");
        }

        //Method... Alternative

        System.out.println( "Another party scenario --- extra method");
        String partyScenario = "We have most of the things we need! we can Party!";
        simplePartyScenario(partyScenario, cake, frenchFries, chickenNuggets, fruits, spaghetti, burger, balloons, candles, confetti, drinks);


    }

    private static void simplePartyScenario(String partyScenario, boolean cake, boolean frenchFries, boolean chickenNuggets, boolean fruits, boolean spaghetti, boolean burger, boolean balloons, boolean candles, boolean confetti, boolean drinks) {
        if ((cake && drinks) && ((frenchFries || chickenNuggets) || (fruits && spaghetti || burger)) && (balloons || candles || confetti)) {
            System.out.println(partyScenario);
        }
    }
}
