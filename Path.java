import java.util.Random;
import java.io.File;
import java.util.Scanner;

public class Path {

    private static final Random random = new Random(); // Random instance to determine if an encounter occurs

    /*
     * Method to prompt the user to choose a path
     * - Prints options for different paths (Left, Center, Right).
     * - Recieves user input as an integer.
     * - Randomly determines if a monster encounter occurs with 2 to 1 odds favoring
     * an encounter
     * - If 0 or 1 -> call the encounter method for the chosen path.
     * - If 2 -> informs the player that the path is clear and allows them to move
     * forward
     * (ie. choose another path.)
     *
     * PARAM - int diffculty
     */


    public static void choosePath(int difficulty) {
        String pathFile = "C:/COMP170+271/COMP170+271/_my_Java_programs/src/MathQuest/src/Main/Monsters/path.txt";
        Scanner output = null;

        System.out.println("It appears you've found another fork in the road...");
        try {
            output = new Scanner(new File(pathFile));
        } catch (Exception e) {
            System.out.println("An error occurred while opening the file.");
            e.printStackTrace();
            return;
        }

        while (output.hasNextLine()) {
            System.out.println(output.nextLine());
        }
        output.close();


        System.out.println("It appears you've found another fork in the road...");
        System.out.println("");
        System.out.println("Choose a path by entering the number:");
        System.out.println("1 - Left");
        System.out.println("2 - Center");
        System.out.println("3 - Right");

        while (true) { // while loop to unsure input is an integer
            if (PreGameInfo.input.hasNextInt()) { // if user enters an integer
                int pathChoice = PreGameInfo.input.nextInt();
                int encounter = random.nextInt(3);

                if (encounter == 0 || encounter == 1) { // If there's an encounter
                    if (pathChoice == 1) {
                        leftPath(difficulty); // Calls Left path
                        break;
                    } else if (pathChoice == 2) {
                        centerPath(difficulty); // Calls Center path
                        break;
                    } else if (pathChoice == 3) {
                        rightPath(difficulty); // Calls Right path
                        break;
                    } else {
                        System.out.println("Invalid choice. Please provide valid input, try again.");
                    }

                } else {
                    // If no encounter occurs
                    EnemyEncounter.points += 4;
                    Main.pathsTraversed += 1;
                    System.out.println("The path before you is clear. Which path shall you take?");
                    choosePath(difficulty); // Prompts the player to choose another path
                }
            } else {
                System.out.println("Invalid choice. Please enter an integer beween 1 and 3, try again.");
                PreGameInfo.input.next();
            }
        }
    }

    /*
     * Method to define actions for left path
     * - Prints a message to the console.
     * - Calls encounter method.
     * PARAM - int difficulty
     */
    private static void leftPath(int difficulty) {
        System.out.println("You take the Left path, venturing into the unknown...");
        EnemyEncounter.encounter(difficulty);
    }

    /*
     * Method to define actions for Center path
     * - Prints a message to the console.
     * - Calls encounter method.
     * PARAM - int difficulty
     */
    private static void centerPath(int difficulty) {
        System.out.println("You walk down the Center path, steady and cautious...");
        EnemyEncounter.encounter(difficulty);
    }

    /*
     * Method to define actions for Right path
     * - Prints a message to the console.
     * - Calls encounter method.
     * PARAM - int difficulty
     */
    private static void rightPath(int difficulty) {
        System.out.println("You turn onto the Right path, feeling a sense of adventure...");
        EnemyEncounter.encounter(difficulty);
    }
}
