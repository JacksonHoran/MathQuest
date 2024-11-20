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
    public static boolean runGame() {
        System.out.println("Would you like to start the game? Type yes or no.");
        String userChoice = input.next().toLowerCase();
        return userChoice.equals("yes");
    }

    /*
     * //prompts user to enter their name, valid
     * input contains no numbers or symbols, sets
     * variable name to user input.
     */
    public static String userName;

    public static void getUsername() {
        System.out.println("Please enter a username:");
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
