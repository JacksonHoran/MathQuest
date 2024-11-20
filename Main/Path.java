import java.util.Random;

public class Path {

    private static final Random random = new Random(); // Random instance to determine if an encounter occurs

    /* Method to prompt the player to choose a path
      - Prints options for different paths (Left, Center, Right).
      - Gets the player’s choice as an integer.
      - Randomly determines if a monster encounter occurs:
         - If so, calls the encounter method for the chosen path.
         - If not, informs the player that the path is clear and allows them to choose another path.
     */

    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void choosePath(int difficulty) {
        System.out.println("Choose a path by entering the number:");
        System.out.println("1 - Left");
        System.out.println("2 - Center");
        System.out.println("3 - Right");

        int pathChoice = PreGameInfo.input.nextInt();

        
        // Randomly determines if an encounter will happen (50% chance for example)
        boolean encounter = random.nextBoolean();

        if (encounter) { // If there's an encounter
            switch (pathChoice) {
                case 1 -> leftPath(difficulty); // Calls Left path
                case 2 -> centerPath(difficulty); // Calls Center path
                case 3 -> rightPath(difficulty); // Calls Right path
                default -> {
                    System.out.println("Invalid choice. Please provide valid input.");
                    choosePath(difficulty); // Prompts again for a valid path if input is invalid
                }
            }
        } else {
            // If no encounter occurs
            System.out.println("The path before you is clear. Which path shall you take?");
            choosePath(difficulty); // Prompts the player to choose another path
        }
    }

    /* Method to define actions for Left path
     - Prints a message to the console.
     - Initiates an encounter with chosen difficulty if a monster is present.
     */
    private static void leftPath(int difficulty) {
        System.out.println("You take the Left path, venturing into the unknown...");
        EnemyEncounter.encounter(difficulty); 
    }

    /* Method to define actions for Center path
      - Prints a message to the console.
      - Initiates an encounter with chosen difficulty if a monster is present.
     */
    private static void centerPath(int difficulty) {
        System.out.println("You walk down the Center path, steady and cautious...");
        EnemyEncounter.encounter(difficulty); 
    }

    /* Method to define actions for Right path
      - Prints a message to the console.
      - Initiates an encounter with chosen difficulty if a monster is present.
     */
    private static void rightPath(int difficulty) {
        System.out.println("You turn onto the Right path, feeling a sense of adventure...");
        EnemyEncounter.encounter(difficulty); 
    }
}
