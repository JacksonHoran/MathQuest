
public class Main{
    public static void main(String[] args){
        while(PreGameInfo.runGame()){
            string userName = PreGameInfo.getUsername();
            int difficulty = PreGameInfo.getDifficulty();
        




            MathProblem.getMathprobem(difficulty); // gets a math problem given the users chosen difficulty

        }
    }
}