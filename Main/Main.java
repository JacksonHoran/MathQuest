
public class Main{
    public static void main(String[] args){
        while(PreGameInfo.runGame()){
            String userName = PreGameInfo.getUsername();
            int difficulty = PreGameInfo.getDifficulty();
            




            MathProblem.getMathProblem(difficulty); // gets a math problem given the users chosen difficulty

        }
    }
}