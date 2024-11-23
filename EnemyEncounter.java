
public class EnemyEncounter {



    public static int points = 0; // Tracks player's points earned through correct answers
    public static int attemptCounter = 0; // Counts attempts per encounter
    public static boolean gameRunning = true; // Controls if the game is active
    public static int livesCounter; // tracks number of liveds player has left

    // needs pseudocode
    public static void livesCounterInit() {
        if (PreGameInfo.difficulty == 1) {
            livesCounter = 1;
        } else if (PreGameInfo.difficulty == 2) {
            livesCounter = 2;
        } else {
            livesCounter = 3;
        }

    }

    

    public static void encounter(int difficulty) {
        attemptCounter = 0; // Resets attempts for the current encounter
        boolean correctAnswer = false;
        MonsterPrinter.printRandomMonster();

        while (!correctAnswer && attemptCounter < 4 && PreGameInfo.runGame) {
            attemptCounter++;
            // if user gets math problem calculate points based off attempts
            if (MathProblem.getMathProblem(difficulty)) {
                calculatePoints(); // Adds points based on number of attempts
                correctAnswer = true;
                Main.pathsTraversed += 1;
            } else if (attemptCounter == 4) {
                System.out.println("Incorrect! The Monster defeated you!");
                Main.pathsTraversed += 1;
            } else {
                System.out.println("Incorrect!");
            }
        }

        // Checks if the maximum attempts have been reached to lose a life
        if (attemptCounter >= 4) {
            loseLife();
        }
    }

    private static void loseLife() {
        livesCounter--; // Deduct a life

        if (livesCounter <= 0) {
            // Game over if no lives remain
            System.out.println("Game over, you've lost all your lives.");
            Ending.showEnding(points); // Show ending screen
            PreGameInfo.runGame = false; // Stop the game
        } else {
            // Print remaining lives if any are left
            System.out.println("The monster beat you, you have " + livesCounter + " lives left.");
            // Allow the game to continue by not changing the runGame flag
        }
    }

    
    private static void calculatePoints() {
        if (attemptCounter == 1) {
            points += 4;
        } else if (attemptCounter == 2) {
            points += 3;
        } else if (attemptCounter == 3) {
            points += 2;
        } else {
            points += 1;
        }
    }
}
