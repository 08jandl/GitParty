package Party;

public class BabyShower {
    public static void main(String[] args) {

        System.out.println("I chose this party because i have two kids");

        //Declare variables with meaningful names and appropriate data types

        //TODO: variable names should always be lower case
        boolean Friends;
        boolean Family;
        boolean Others;
        boolean Kids;
        boolean orderMoreFood;


        Friends = true;
        Family = false;
        Others = false;
        Kids = true;

        orderMoreFood =  Friends && (Family || Others || Kids);

        MoreFood( orderMoreFood );

        // Reuse 1 method



        Friends = true;
        Family = false;
        Others = false;
        Kids = false;

        orderMoreFood = Friends && (Family || Others || Kids);



        MoreFood( orderMoreFood );

//Reuse 1 method


    }


    //TODO: method names should also always be lower case
    public static void MoreFood (boolean orderMoreFood) {
        if (orderMoreFood) {
            System.out.println("Please order more food");
        } else {
            System.out.println("We have enough food");
        }

    }
}
