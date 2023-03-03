package Party;

public class KaraokeParty {
    public static void main(String[] args) {
        System.out.println("I like to sing and have fun. Whoop! Whoop!");

        String noiseFaktor;
        String whichGenre;
        int howManyPeople;
        boolean earPain;
        boolean earCandy;
        boolean neighboursComplain;
        double alcIntus;

        earPain = true;
        earCandy = true;
        howManyPeople = 13;
        alcIntus = 0.6;
        whichGenre = "noisy";

        neighboursComplain = howManyPeople > 3 && alcIntus > 0.5;

        printPartyFeedback(howManyPeople, alcIntus, neighboursComplain);






    }
    private static void printPartyFeedback(int howManyPeople, double alcIntus, boolean neighboursComplain) { //muss die deklarierten Variablen der Methode mitgeben
        if (neighboursComplain) {
            System.out.println("The party was a success. " + howManyPeople + " managed to cause excitement.");
        } else {
            System.out.println("We have to push it some more! Probably we need to increase alcohol level by " + alcIntus + " . ");
        }
    }
}
