package Party;

import java.util.Scanner;

public class GameNight {
    public static void main(String[] args) {
        System.out.println(" I like to play games");
        String startMessage;
        startMessage = "Welcome to the Game! Choose a party name by typing the first letter of your name and your birth month ";
        System.out.println(startMessage);

        Scanner putInLetter = new Scanner(System.in);

        String letter = " ";
        int month = 0;

        System.out.println("Enter first letter: ");

        month = putInLetter.nextInt();


        switch (letter) {
            case "A" -> System.out.println("Sassy");
            case "B" -> System.out.println("Flirty");
            case "C" -> System.out.println("Sparkley");
            case "D" -> System.out.println("Shy");
            case "E" -> System.out.println("Fruity");
            case "F" -> System.out.println("Tangly");
            case "G" -> System.out.println("Flashy");
            case "H" -> System.out.println("Wild");
            case "I" -> System.out.println("Prefect");
            case "J" -> System.out.println("Funny");
            case "K" -> System.out.println("Silly");
            case "L" -> System.out.println("Cutey");
            case "M" -> System.out.println("Jazzy");
            case "N" -> System.out.println("Twinkle");
            case "O" -> System.out.println("Bubbly");
            case "P" -> System.out.println("Lovely");
            case "Q" -> System.out.println("Crazy");
            case "R" -> System.out.println("Dreamy");
            case "S" -> System.out.println("Steamy");
            case "T" -> System.out.println("Dainty");
            case "U" -> System.out.println("Classy");
            case "V" -> System.out.println("Sappy");
            case "W" -> System.out.println("Trouble");
            case "X" -> System.out.println("Fizzy");
            case "Y" -> System.out.println("Dippy");
            case "Z" -> System.out.println("Flaky");
            case default -> System.out.println("WTF! That doesnt work. Put in a dam letter!");
        }
        ;

        switch (month) {
            case 1 -> System.out.println("Sugar-lips");
            case 2 -> System.out.println("Honey-bunch");
            case 3 -> System.out.println("Snookie-poo");
            case 4 -> System.out.println("Toodle-bugs");
            case 5 -> System.out.println("Baby-cakes");
            case 6 -> System.out.println("Pumpkin-butt");
            case 7 -> System.out.println("Skilly-willy");
            case 8 -> System.out.println("Cutie-pie");
            case 9 -> System.out.println("Bunny-boo");
            case 10 -> System.out.println("Snicker-doo");
            case 11 -> System.out.println("Lovey-dovey");
            case 12 -> System.out.println("Cuddle-bug");
            case default -> System.out.println("Oh...I didn't know the year has more the 12 months. Enter 01 - 12.");
        }

    }
}
