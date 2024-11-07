import java.util.Scanner;

public class EnemyEncounter {

// Use static private variables to manage shared state across all instances of the class in a controlled way.

    private static int points = 0; // Tracks player's points earned through correct answers
    private static int attemptCounter = 0; // Counts attempts per encounter
    private static boolean gameRunning = true; // Controls if the game is active
    private static Scanner scanner170 = new Scanner(System.in); // Scanner for user input

    /* Method to simulate an enemy encounter
     - Takes an integer parameter "difficulty" to decide the complexity of the math problem.
     - Resets attemptCounter to zero each time an encounter begins.
     - Uses a while loop to allow up to four attempts to answer correctly:
        - Each incorrect answer increases attemptCounter by 1.
        - If attemptCounter reaches 4, gameRunning is set to false, ending the game.
     - Calls calculatePoints() if the user answers correctly.
     */

    public static void encounter(int difficulty) {
        attemptCounter = 0; // Resets attempts for the current encounter
        boolean correctAnswer = false;

        while (!correctAnswer && attemptCounter < 4) {
          // calls MathProblem to get a math problem answer based on difficulty
            int correctAnswerValue = MathProblem.getMathprobem(difficulty); // Generates and interprets the correct answer
            System.out.print("Enter your answer: ");
            int userAnswer = scanner170.nextInt(); // Capture user's answer

          // if statement to check validity for points / attempts
            if (userAnswer == correctAnswerValue) {
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

    /* Private helper method to calculate points
      - Uses attemptCounter to add points:
        - Adds 4 points for a first-attempt correct answer.
        - Adds 3 points for a second-attempt correct answer.
        - Adds 2 points for a third-attempt correct answer.
        - Adds 1 point for a fourth-attempt correct answer.
      - Updates the points variable each time the player answers correctly.
     */
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

   // method for returning gameRunning status 
    public static boolean isGameRunning() {
        return gameRunning;
    }

   // method for returning points
    public static int getPoints() {
        return points;
    }
}
