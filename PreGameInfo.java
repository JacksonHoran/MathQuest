import java.util.Scanner;

public class PreGameInfo {

    public static Scanner input = new Scanner(System.in);


    public static boolean runGame;

    public static void runGameInit() {
        while (true) {
            System.out.println("Welcome to MathQuest!!");
            System.out.println("Would you like to start the game? Type Y or N.");
            if (input.hasNext()) {
                String userChoice = input.nextLine().trim().toUpperCase();
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


    public static String userName;

    public static void getUsername() {
        while (true) {
            System.out.println("Please enter your name:");
            userName = input.nextLine().trim(); // Removes leading/trailing whitespace

            // Validate input
            if (userName.isEmpty()) { // TB page 724
                System.out.println("Name cannot be empty. Please try again.");
            } else if (!userName.matches("[a-zA-Z\\s]+")) { // Allows only letters and spaces
                System.out.println("Name can only contain letters and spaces. Please try again.");
            } else {
                break; // Valid input, exit loop
            }
        }
        System.out.println("Welcome, " + userName + "!");
    }


    public static int difficulty;

    public static void getDifficulty() {

        System.out.println("Choose your difficulty by typing the number corresponding to difficulty level.");
        System.out.println("1 - Easy");
        System.out.println("2 - Medium");
        System.out.println("3 - Hard");

        while (true) {
            String choice = input.nextLine();
            int parsedDifficulty = Integer.parseInt(choice);
            try {
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
