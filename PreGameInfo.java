import java.util.Scanner;

public class PreGameInfo {

    // initialize Scanner(System.in) for whole program
    public static Scanner input = new Scanner(System.in);

    // define runGame boolean
    public static boolean runGame;


    /*
    This method initializes a value for runGame, it is only once in the 
    life of the program but it just makes sure that the user wants to 
    play the game. the method uses a while loop nd if/else statements. 
    The methos asks the user if theyd like to start the game, if they type 'y' the game starts, 
    if they type 'n' the program ends.
    */
    public static void runGameInit() {

        while (true) { // ensures proper input

            // prints narration
            System.out.println("Welcome to MathQuest!!");
            System.out.println("Would you like to start the game? Type Y or N.");

            // checks there is a token in the buffer
            if (input.hasNext()) {
                String userChoice = input.nextLine().trim().toUpperCase(); // format the data
                if (userChoice.equalsIgnoreCase("Y")) {
                    runGame = true;
                    break;
                } else if (userChoice.equalsIgnoreCase("N")) {
                    runGame = false;
                    break;
                } else {
                    System.out.println("Invalid input, please try again.");
                }
            }
        }
    }

    // define username string
    public static String userName;

    /*
    a method to get the users desired username. uses scanner to get input from the console
    saves the string in userName variable. the method allows the user to use any combinaiton 
    of numbers and letts or other characters. as long as the string is not empty it will be saved as their username. 

    str.isEmpty() found on TB page 724
    */
    public static void getUsername() {

        // asks for username till there is input
        while (true) {
            System.out.println("Please enter your name:");
            userName = input.nextLine().trim(); // removes leading/ending whitespace

            // Validate input
            if (userName.isEmpty()) { 
                System.out.println("Name cannot be empty. Please try again.");
            } else {
                break; // Valid input, exit loop
            }
        }
        System.out.println("Welcome, " + userName + "!");
    }


    // define difficulty variable
    public static int difficulty;

    /*
    This method prints some narration to the user and asks them which 
    difficulty level they want to choose, they are given three options every time.
    the method uses a while loop, a try/catch block and some if/else 
    statements to properly get the input from the user wthout causing 
    any issues with the buffer later in the program. the methos protects 
    against poor input in a few ways. if they enter an integer that isnt 1, 2, or 3 
    they are just asked again. if they dont enter an integer a number format exception is thrown.

    try/catch -  textbook page 398, 1186
    "Integer.parseInt()" - https://stackoverflow.com/questions/5585779/how-do-i-convert-a-string-to-an-int-in-java 
    */
    public static void getDifficulty() {

        // print narration
        System.out.println("Choose your difficulty by typing the number corresponding to difficulty level.");
        System.out.println("1 - Easy");
        System.out.println("2 - Medium");
        System.out.println("3 - Hard");

        // gets user choice from console
        while (true) {
            String choice = input.nextLine();

            // if input is not 1, 2, or 3 catch exception
            try {
                int parsedDifficulty = Integer.parseInt(choice);
                if (parsedDifficulty == 1 || parsedDifficulty == 2 || parsedDifficulty == 3) {
                    difficulty = parsedDifficulty;
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 1, 2, or 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input, PLease enter 1, 2, or 3.");
            }
        }
    }
}
