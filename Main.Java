import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        getDifficulty();
        MathProblem.getMathprobem(difficulty); // gets a math problem given the isers chosen difficulty
    }
    public static int getDifficulty(){
        Scanner console = new Scanner();
        System.out.println("Choose your difficulty by typing the number corresponding to difficulty level.")
        System.out.println("1 - Easy")
        System.out.println("2 - Medium")
        System.out.println("3 - Hard")
        int difficulty  = console.nextInt();
        return difficulty;
    }

}