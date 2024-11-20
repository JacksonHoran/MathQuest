
public class Main{
    public static void main(String[] args){
        while(PreGameInfo.runGame()){
            PreGameInfo.getUsername();
            PreGameInfo.getDifficulty();
            printRound(GameSettings.difficulty);





        }
    }

    private static void printRound(int difficulty){
        Path.choosePath(difficulty);
        Path.choosePath(difficulty);
        Path.choosePath(difficulty);    
        Path.choosePath(difficulty);
    }
}