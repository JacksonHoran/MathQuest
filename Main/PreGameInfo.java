import java.util.Scanner;

public class PreGameInfo {

    public static Scanner input = new Scanner(System.in);
    

    /*
     * this method promts the user to decide whether or not they want to play the
     * game
     * if they ansere with yes, the while loop in main runs and if they answer no
     * then
     * the program ends
     */

    public static boolean runGame;

    public static void runGameInit() {
        System.out.println("Welcome to MathQuest!!");
        System.out.println("Would you like to start the game? Type Y or N.");
        String userChoice = input.nextLine().toUpperCase();
        runGame = userChoice.equals("Y");

        // refactor such that the boolean is able to be changed throughout the program,
        // in the case that
        // user runs out of lives the game should end.
    }

    /*
     * //prompts user to enter their name, valid
     * input contains no numbers or symbols, sets
     * variable name to user input.
     */
    public static String userName;

    public static void getUsername() {
        System.out.println("Please enter your name:");
        userName = input.nextLine();
    }

    /*
     * uses Scanner170 to obtain input from the user. prints three options
     * to the user and asks them to choose their desired difficulty. the method
     * returns an integer value
     */
    public static int difficulty;

    public static void getDifficulty() {
        System.out.println("Choose your difficulty by typing the number corresponding to difficulty level.");
        System.out.println("1 - Easy");
        System.out.println("2 - Medium");
        System.out.println("3 - Hard");
        difficulty = input.nextInt();

    }
}
