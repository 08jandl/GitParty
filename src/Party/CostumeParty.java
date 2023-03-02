package Party;

public class CostumeParty {
    public static void main(String[] args) {
        //Tell us why you chose that Party
        System.out.println("I chose the Costume Party because I love to Cosplay and ware Costume:)");

        //Declare variables with meaningful names and appropriate data types

        String guest;
        String thema;
        boolean isinCostume;
        boolean costumeIsThemaBased;
        boolean costumeIsFunny;
        boolean goodCostume;
        boolean amazingCostume;
        boolean themaCostume;

        //Initialize your variables
        guest = "Yasmin";
        thema = "Ocean based";
        isinCostume = false;
        costumeIsThemaBased = false;
        costumeIsFunny = false;


        //create at least 1 logical equation using your variables
        goodCostume = isinCostume && (costumeIsFunny && !costumeIsThemaBased);
        amazingCostume = isinCostume && (costumeIsFunny && costumeIsThemaBased);
        themaCostume = isinCostume && (costumeIsThemaBased && !costumeIsFunny);


        //Create and (re-)use at least 1 methode
        coolGuest(guest, thema, goodCostume,amazingCostume,themaCostume);


        //reassigning variables to use second time

        //Initialize your variables
        guest = "Jess";
        isinCostume = true;
        costumeIsThemaBased = true;
        costumeIsFunny = true;


        //create at least 1 logical equation using your variables
        goodCostume = isinCostume && (costumeIsFunny && !costumeIsThemaBased);
        amazingCostume = isinCostume && (costumeIsFunny && costumeIsThemaBased);
        themaCostume = isinCostume && (costumeIsThemaBased && !costumeIsFunny);


        //Create and (re-)use at least 1 methode
        coolGuest(guest, thema,goodCostume,amazingCostume, themaCostume);

        //Initialize your variables
        guest = "Mike";
        isinCostume = true;
        costumeIsThemaBased = true;
        costumeIsFunny = false;


        //create at least 1 logical equation using your variables
        goodCostume = isinCostume && (costumeIsFunny && !costumeIsThemaBased);
        amazingCostume = isinCostume && (costumeIsFunny && costumeIsThemaBased);
        themaCostume = isinCostume && (costumeIsThemaBased && !costumeIsFunny);


        //Create and (re-)use at least 1 methode
        coolGuest(guest, thema,goodCostume,amazingCostume, themaCostume);


    }

    //Create and (re)-use at least 1 method
    private static void coolGuest(String guest, String thema, boolean goodCostume, boolean amazingCostume, boolean themaCostume) {
        if (amazingCostume) {
            System.out.println(guest + " had an amazing outfit, it was funny and hit the " + thema);
        } else if (goodCostume) {
            System.out.println(guest + " wasn't " + thema + " dressed but it was funny ");
        } else if (themaCostume) {
            System.out.println(guest + " had a " + thema + " outfit but it don't look funny. ");

        } else
            System.out.println(guest + " hadn't a Costume.");
    }

}
