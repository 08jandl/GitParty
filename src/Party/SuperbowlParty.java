package Party;

public class SuperbowlParty {
    public static void main(String[] args) {
        //Tell us why you chose that party:
        System.out.println("I chose that party because I love having a nice time with people watching football and eating lots of nice food in the process :-)");

        //Declare variables with meaningful names and appropriate data types:
        String footballTeam1;
        String footballTeam2;
        String footballTeam3;
        boolean epicTeam;
        boolean niceTeam;
        boolean uncoolTeam;
        boolean successfulEvening;

        //Initialize your variables:
        footballTeam1 = "New York Giants";
        footballTeam2 = "Dallas Cowboys";
        footballTeam3 = "Philadelphia Eagles";
        epicTeam = true;
        niceTeam = true;
        uncoolTeam = false;

        //Create at least 1 logical equation using your variables:
        successfulEvening = (epicTeam && uncoolTeam) || niceTeam;

        //Create and (re)-use at least 1 method:
        printSuccessfulEveningResults(footballTeam1, footballTeam2, footballTeam3, successfulEvening);

        //Reassigning variables to use a second time:
        footballTeam1 = "Seattle Bagels";
        footballTeam2 = "Ohio Pancakes";
        footballTeam3 = "Kentucky Mushrooms";
        epicTeam = false;
        niceTeam = false;
        uncoolTeam = true;
        successfulEvening = (epicTeam && uncoolTeam) || (niceTeam && uncoolTeam);

        //Create and (re)-use at least 1 method:
        printSuccessfulEveningResults(footballTeam1, footballTeam2, footballTeam3, successfulEvening);
    }
        //Create and (re)-use at least 1 method:
        private static void printSuccessfulEveningResults(String footballTeam1, String footballTeam2, String footballTeam3, boolean successfulEvening){
            if (successfulEvening){
                System.out.println("I really liked the games with the " + footballTeam1 + "-Team and the " + footballTeam2 + "-Team.");
            } else {
                System.out.println("I actually hated the game-night cause' the " + footballTeam3 + "-Team unfortunately won.");
            }
        }
}
