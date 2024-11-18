

public class Game {



  
  public static void runGame{
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
    
    
  
