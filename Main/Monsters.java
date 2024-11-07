import java.util.Random;
import java.util.Arrays;

public class showMonsters{ //this will be used in conjunction with the MathProblem class during "encounters"
  public static void Main(String[]args){
    String[]monsters = {""} //array will be full of multiple ASCII-drawn monsters
    
    Random random = new Random(); //creates new random variable to get a random item from the monsters list

        //makes random index within the monsters array bounds
        int randomIndex = random.nextInt(monsters.length);

      
        String randomMonster = monsters[randomIndex]; //gets random monster
