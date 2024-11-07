import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        MathProblem.getMathprobem(CHOSEN_DIFFICULTY); // gets a math problem given the users chosen difficulty
    }

    /* uses Scanner170 to obtain input from the user. prints three options 
    to the user and asks them to choose their desired difficulty. the method 
    returns an integer value*/
    public static int getDifficulty(){
        Scanner console = new Scanner(System.in);
        System.out.println("Choose your difficulty by typing the number corresponding to difficulty level.");
        System.out.println("1 - Easy");
        System.out.println("2 - Medium");
        System.out.println("3 - Hard");
        int difficulty  = console.nextInt();
        return difficulty;
    }
    /* Static final variable that calls getDifficulty. this will make the 
    users input final for whole game*/
    public static final int CHOSEN_DIFFICULTY = getDifficulty();
}