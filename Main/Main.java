public class Main {
    public static void main(String[] args) {
        PreGameInfo.runGameInit();
        while (PreGameInfo.runGame) {
            PreGameInfo.getUsername();
            PreGameInfo.getDifficulty();
            EnemyEncounter.livesCounterInit();
            game(PreGameInfo.difficulty);
        }
    }

    private static void game(int difficulty) {
        System.out.println("It seems you've found yourself in the middle of the forest, quite a ways from home.\nYou're not sure where you are or how you got here, but you're determined to find your way back.");
        System.out.println("Prepare yourself! The adventure begins...");
        int numOfPaths = difficulty + 2;
        for (int i = 0; i <= numOfPaths; i++) {
            Path.choosePath(difficulty);

            // Check if the game is still running
            if (!PreGameInfo.runGame) {
                return;
            }
            
        }

        System.out.println("Congratulations! You have successfully completed the adventure!");
    }

}
