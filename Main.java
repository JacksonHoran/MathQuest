
public class Main {
    public static void main(String[] args) {
        PreGameInfo.runGameInit();
        while (PreGameInfo.runGame) {
            PreGameInfo.getUsername();
            PreGameInfo.getDifficulty();
            System.out.println(PreGameInfo.difficulty);
            EnemyEncounter.livesCounterInit();
            game(PreGameInfo.difficulty);
            break;
        }
    }

    public static int pathsTraversed = 0;

    private static void game(int difficulty) {
        do {
            // Reset game state before starting a new game
            EnemyEncounter.points = 0; // Reset points
            PreGameInfo.runGame = true; // Ensure the game is set to run

            System.out.println(
                    "It seems you've found yourself in the middle of the forest, quite a ways from home. "
                            + "You're not sure where you are or how you got here, but you're determined to find your way back.");
            System.out.println("Prepare yourself! The adventure begins...");

            int numOfPaths = difficulty + 2;


            while (true) {
                if (numOfPaths > pathsTraversed) {
                    Path.choosePath(difficulty);
                } else {
                    Ending.showEnding();
                    break;
                }
            }
        } while (Ending.restartGame); // Restart the game if the player chooses to replay

        System.out.println("Thank you for playing!!!");
    }
}
