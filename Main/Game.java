

public class game {

import java.util.Scanner;
Scanner scanner170 = new Scanner(system.in);

   
  
  public static void getUsername{ //prompts user to enter their name, valid input contains no numbers or symbols, sets variable name to user input. 
    String getUsername;

  }
  public static void getDifficulty{ // prompts the user to choose difficulty, and the variable difficulty will be set to 1, 2, or 3 depending on the player's choice, which will be stored in difficultyChoice. 
    System.out.print();//asks player what difficulty they'd like to choose
    int difficultyChoice;
    int difficulty = 0;
      if(difficultyChoice == 1){ //if the choice is 1 (easy), difficulty is assigned the number 1 and becomes the argument that is passed through getMathProblem
      }elif(difficultyChoice == 2){ //difficulty assigned to 2 (medium)
      }elif(difficultyChoice == 3){ //difficulty assigned to 3 (hard)
      }else{ //if the input is not the number 1, 2, or 3, an error message will appear and the message will be asked again.
      }
      

  
  public static void runGame{
      getUsername(); //ask user for their name, sets variable userName to given input.
        //Asks player if they'd like to start the game, gets value of answer with scanner170, depending on answer "Y" or "N", boolean variable gameRunning will be set to true or false, and either do nothing or start game
       //ask player Y or N
   if{ //if the input is Y, the gameRunning variable is set to true, and the game starts.
     while{ //while gameRunning is true, execute game methods
      
      if(turns>=3){ //if 3 turns have been played, the ending based on how many points the player got will be shown.
      }if(points >= 9){  //the next 3 if statements take into account how many "points" the player accrued, and return a specific ending depending on their performance. They also set the ending variable to true.
        return ending3;
        ending = true;
      }
      if(points >=6){
        return ending2;
        ending = true;

      }if(points >= 3){
        return ending1;
        ending = true;
      }
      if(ending == true){ //once the ending variable is set to true by one of the 
       break
      }
   }else{ //in the event the player says no, "loses", or does anything to make gameRunning false
  }
}
}


  
    
    }
    
    
  
