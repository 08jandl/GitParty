package Party;

public class HouseWarmingParty {
    public static void main(String[] args) {
    // Tell us why you chose that party
        System.out.println("I chose this party because we recently moved into a new flat");

    // Declare variables with meaningful name and appropriate data types

      String friend;
      String gift;
      boolean expensiveGift;
      boolean usefulGift;
      boolean creativeGift;
      boolean goodFriend;

    //Initialize your variables

        friend = "Clara";
        gift = "clothes pegs";
        expensiveGift = false;
        usefulGift = true;
        creativeGift = false;

//        Create at least one logical equation using your variables

        goodFriend = expensiveGift && (usefulGift || creativeGift);

//        Create an (re)- use at least one method

        showBestFriend(friend,goodFriend);

        //Reassigning variables to use a second time

        friend = "Hildegard";
        gift = "Espresso machine";
        expensiveGift = true;
        usefulGift = true;
        creativeGift = false;
        goodFriend = expensiveGift && (usefulGift || creativeGift);

        showBestFriend(friend, goodFriend);


    }
    private static void showBestFriend ( String friend, boolean goodFriend) {
        if (goodFriend) {
            System.out.println(friend + ", you are really my best friend! " );
        } else {
            System.out.println("Why did I even invite you, " + friend + "?");
        }
    }
}
