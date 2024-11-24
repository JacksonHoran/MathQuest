import java.util.Random;
import java.io.File;
import java.util.Scanner;

public class Path {

    private static final Random random = new Random(); // Random instance to determine if an encounter occurs
    
    private static void printPath(){
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
    }

    

    public static void choosePath(int difficulty) {
        
        printPath();
        System.out.println("It appears you've found another fork in the road...");
        System.out.println("");
        System.out.println("Choose a path by entering the number:");
        System.out.println("1 - Left");
        System.out.println("2 - Center");
        System.out.println("3 - Right");

        while (true) { // while loop to unsure input is an integer
            if (PreGameInfo.input.hasNextInt()) { // if user enters an integer
                int pathChoice = Integer.parseInt(PreGameInfo.input.nextLine());
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
