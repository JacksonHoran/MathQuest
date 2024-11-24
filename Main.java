
public class Main {
    public static void main(String[] args) {
        //initialozes runGame Boolean
        PreGameInfo.runGameInit();

        // runs till runGame is set to false
        while (PreGameInfo.runGame) {
            PreGameInfo.getUsername(); // gets a username
            PreGameInfo.getDifficulty(); // gets users desired difficulty level
            EnemyEncounter.livesCounterInit(); // initializes the how many lives the player gets
            game(PreGameInfo.difficulty); // calls the methods that progress the game
            break;
        }
    }

    
    // initializes an integer to track how many times the player chosen a path
    public static int pathsTraversed = 0;
    
    /*
    this is the game driver method, the method first prints some narration 
    to the player, then calls the choose path method so long as the number
    of paths traversed is less than the total number of allowed paths.
    */
    private static void game(int difficulty) {
        
        // Print narration
        System.out.println(
                "It seems you've found yourself in the middle of the forest, quite a ways from home. "
                        + "You're not sure where you are or how you got here, but you're determined to find your way back.");
        System.out.println("Prepare yourself! The adventure begins...");

        // total number of paths to play is set by the difficulty plus 2
        int numOfPaths = difficulty + 2;

        // calls choosePath() till player reaches max allowed
        while (true) {
            if (numOfPaths > pathsTraversed) {
                Path.choosePath(difficulty);
            } else {
                Ending.showEnding();
                break;
            }
        }
        System.out.println("Thank you for playing!!!");
    }
}
