import java.util.Random;
import java.io.File;
import java.util.Scanner;

public class Path {

    // initialize private random instance
    private static final Random random = new Random(); // determines if an encounter occurs

    
    /*
    This method prints an ASCII picture to the console. the method uses scanner to get and read the file.
    the methos uses a try/catch block to get the file and throws an exception if the file is not found. 
    If the file is not found the program calls the printStackTrace method in throwables class which prints the trace to where the issue is.
    sort of like a file path but instead it shows exactly where the error in the program is. found this method in oracles java documentation about throwables.
    linked below. If the file is found it is printed to the console line by line.

    ASCII was made by us
    printStackTrace - https://docs.oracle.com/javase/6/docs/api/java/lang/Throwable.html
    Also used - https://stackoverflow.com/questions/47293754/using-try-catch-for-files-in-java
    */
    private static void printPath() {

        // initialie filepath for path ASCII
        String pathFile = "C:/COMP170+271/COMP170+271/_my_Java_programs/src/MathQuest/Monsters/path.txt";

        // new scanner instance set to null because it gets closed by the try statement prematurely if it is created inside of it
        Scanner output = null;

        //prints narration
        System.out.println("It appears you've found another fork in the road...");

        // try/catch to get file 
        try {
            output = new Scanner(new File(pathFile));
        } catch (Exception e) {
            System.out.println("An error occurred while opening the file.");
            e.printStackTrace();
            return;
        }

        // prints ASCII line by line
        while (output.hasNextLine()) {
            System.out.println(output.nextLine());
        }
        
        // close scanner to prevent future bugs
        output.close();
    }

    /*
    This method prints some narration to the user and asks them which 
    path they want to choose, they are given three options every time.
    the method uses a while loop, a try/catch block and some if/else 
    statements to properly get the input from the user wthout causing 
    any issues with the buffer later in the program. the methos protects 
    against poor input in a few ways. if they enter an integer that isnt 1, 2, or 3 
    they are just asked again. if they dont enter an integer a number format exception is thrown.

    try/catch -  textbook page 398, 1186
    "Integer.parseInt()" - https://stackoverflow.com/questions/5585779/how-do-i-convert-a-string-to-an-int-in-java 
    */
    public static void choosePath(int difficulty) {

        //print narration and path choice promt
        printPath();
        System.out.println("It appears you've found another fork in the road...");
        System.out.println("");
        System.out.println("Choose a path by entering the number:");
        System.out.println("1 - Left");
        System.out.println("2 - Center");
        System.out.println("3 - Right");

        // gets users choice from console
        while (true) {
            String choice = PreGameInfo.input.nextLine(); // Directly read the integer
            try {
                int pathChoice = Integer.parseInt(choice);
                // Check if the choice is valid
                if (pathChoice >= 1 && pathChoice <= 3) {
                    int encounter = random.nextInt(3);
                    if (encounter == 0 || encounter == 1) { // If there's an encounter
                        if (pathChoice == 1) {
                            leftPath(difficulty); // Calls Left path
                            break; // Exit the loop after valid path choice
                        } else if (pathChoice == 2) {
                            centerPath(difficulty); // Calls Center path
                            break; // Exit the loop after valid path choice
                        } else if (pathChoice == 3) {
                            rightPath(difficulty); // Calls Right path
                            break; // Exit the loop after valid path choice
                        }
                    } else {
                        // If no encounter occurs
                        EnemyEncounter.points += 4;
                        Main.pathsTraversed += 1;
                        System.out.println("The path before you is clear. Which path shall you take?");
                        choosePath(difficulty); // Prompts the player to choose another path
                        break; // Exit loop after valid input and action
                    }
                } else {
                    // Invalid path choice (not between 1 and 3)
                    System.out.println("Invalid choice. Please provide a valid number between 1 and 3.");
                }
            } catch (NumberFormatException e) {
                // Not an integer input
                System.out.println("Invalid choice. Please enter an integer between 1 and 3.");
            }
        }
    }

    
    /*
    These next three methods act identically, when they are called they print a narration message
    then call the encounter method with parameter difficulty.
    */
    private static void leftPath(int difficulty) {
        System.out.println("You take the Left path, venturing into the unknown...");
        EnemyEncounter.encounter(difficulty);
    }


    private static void centerPath(int difficulty) {
        System.out.println("You walk down the Center path, steady and cautious...");
        EnemyEncounter.encounter(difficulty);
    }


    private static void rightPath(int difficulty) {
        System.out.println("You turn onto the Right path, feeling a sense of adventure...");
        EnemyEncounter.encounter(difficulty);
    }
}
