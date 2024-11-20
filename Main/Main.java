public class Main {
    public static void main(String[] args) {
        while (PreGameInfo.runGame()) {
            PreGameInfo.getUsername();
            PreGameInfo.getDifficulty();
            game(PreGameInfo.difficulty);
        }
    }

    private static void game(int difficulty) {
        Path.choosePath(difficulty);
        Path.choosePath(difficulty);
        Path.choosePath(difficulty);
        Path.choosePath(difficulty);
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