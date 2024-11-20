
public class EnemyEncounter {

    // Use static private variables to manage shared state across all instances of
    // the class in a controlled way.

    public static int points = 0; // Tracks player's points earned through correct answers
    public static int attemptCounter = 0; // Counts attempts per encounter
    public static boolean gameRunning = true; // Controls if the game is active

    /*
     * Method to simulate an enemy encounter
     * - Takes an integer parameter "difficulty" to decide the complexity of the
     * math problem.
     * - Resets attemptCounter to zero each time an encounter begins.
     * - Uses a while loop to allow up to four attempts to answer correctly:
     * - Each incorrect answer increases attemptCounter by 1.
     * - If attemptCounter reaches 4, gameRunning is set to false, ending the game.
     * - Calls calculatePoints() if the user answers correctly.
     */

    public static void encounter(int difficulty) {
        attemptCounter = 0; // Resets attempts for the current encounter
        boolean correctAnswer = false;

        while (!correctAnswer && attemptCounter < 4) {
            // if ueer gets math problem calculate points based off attempts
            if (MathProblem.getMathProblem(difficulty)) {
                calculatePoints(); // Adds points based on number of attempts
                correctAnswer = true;
            } else {
                attemptCounter++; // Increments attemptCounter for each incorrect answer
            }
        }

        // Checks if the maximum attempts have been reached to end the game
        if (attemptCounter >= 4) {
            gameRunning = false; // Ends game if max attempts exceeded
        }
    }

    /*
     * Private helper method to calculate points
     * - Uses attemptCounter to add points:
     * - Adds 4 points for a first-attempt correct answer.
     * - Adds 3 points for a second-attempt correct answer.
     * - Adds 2 points for a third-attempt correct answer.
     * - Adds 1 point for a fourth-attempt correct answer.
     * - Updates the points variable each time the player answers correctly.
     */
    private static void calculatePoints() {
        switch (attemptCounter) {
            case 1 -> points += 4;
            case 2 -> points += 3;
            case 3 -> points += 2;
            default -> points += 1;
        }
    }

    // method for returning gameRunning status
    public static boolean isGameRunning() {
        return gameRunning;
    }

    // method for returning points
    public static int getPoints() {
        return points;
    }
}
