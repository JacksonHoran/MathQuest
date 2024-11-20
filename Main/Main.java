public class Main{
    public static void main(String[] args){
        while(PreGameInfo.runGame()){
            PreGameInfo.getUsername();
            PreGameInfo.getDifficulty();
            game(PreGameInfo.difficulty);





        }
    }

    private static void game(int difficulty){
        Path.choosePath(difficulty);
        Path.choosePath(difficulty);
        Path.choosePath(difficulty);    
        Path.choosePath(difficulty);
    }

}