public class Main {
    public static void main(String[] args) {
        PreGameInfo.runGameInit();
        while (true) {
            if (!PreGameInfo.runGame) {
                break;
            }
            PreGameInfo.getUsername();
            PreGameInfo.getDifficulty();
            game(PreGameInfo.difficulty);
        }
    }

    private static void game(int difficulty) {
        System.out.println("Prepare yourself! The adventure begins...");
        int numOfPaths = difficulty + 2;
        for (int i = 0; i <= numOfPaths; i++) {
            Path.choosePath(difficulty);

            // Check if the game is still running
            if (!PreGameInfo.runGame) {
                System.out.println("Game Over! Better luck next time.");
                return; // Exit the game loop if the player loses
            }
        }

        System.out.println("Congratulations! You have successfully completed the adventure!");
    }

    public static int livesCounter;

    public static void livesCounterInit() {
        switch (PreGameInfo.difficulty) {
            case 1 -> livesCounter = 1;
            case 2 -> livesCounter = 2;
            default -> livesCounter = 3;
        }
    }
}