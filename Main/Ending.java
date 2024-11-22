import java.util.Scanner; 

public class Ending{
  public static void showEnding(int totalPoints){
    Scanner input = Scanner scanner = new Scanner(System.in);
    
    if(EnemyEncounter.calculatepoints(totalPoints)<=12){
      System.out.println("You find yourself here, home at last!!\nHowever, all is quiet….\nIt appears nobody is around…. Where could they be??\nYou hear a commotion come from behind one of your neighbors homes….\nYou go to investigate, only to find the monster that has eaten your entire village!!\nIt appears you took too long on your journey home, leaving time for this monster to eat everyone you know!!\nAs the creature approaches you, teeth bared, it growls “Maybe if you were a little better at math, this wouldn’t have happened…”\nYou close your eyes, realizing he’s right, and accept your fate.(ENDING ⅓)");
      System.out.println("You scored "+points+"total points!");
      System.out.println("If you'd prefer a different fate, maybe try taking on this adventure once again by pressing Y or N...")
      String choice = scanner.nextLine();
      String choice = input.nextLine().toUpperCase();
      if(choice=="Y"){
        PreGameInfo.runGame = false;
      }
      else{
        System.out.println("Thank you for playing! See you next time!");
    else if(EnemyEncounter.calculatepoints(totalPoints)<=15){
      System.out.println("You excitedly rush towards your village, relieved to be home.\nYou rush to your house, and find your mother washing dishes in the kitchen.\nShe turns around and greets you, nonchalantly as if nothing happened and you didn’t go missing.\nYou ask her if she realized you were gone for the past 2 days, she says “No, did you go somewhere?”\nDejected, you leave and walk to the town square, searching around for someone, anyone happy to see you back.\nYour neighbors politely greet you, but are completely unaware that you ever went missing.You trudge home, safe, but distraught at just how easily your disappearance went overlooked by your friends and family.\nMaybe if you were just a bit more remarkable, a little better at math, people would have noticed your absence. (ENDING ⅔)");
      System.out.println("You scored "+points+"total points!");
      System.out.println("If you'd prefer a different fate, maybe try taking on this adventure once again by pressing Y or N...")
      String choice = scanner.nextLine();
      String choice = input.nextLine().toUpperCase();
      if(choice=="Y"){
        PreGameInfo.runGame = false;
      }
      else{
        System.out.println("Thank you for playing! See you next time!");
    else if(EnemyEncounter.caclculatepoints(totalPoints)>=19){
      System.out.println("You excitedly rush towards your village, relieved to be home.\nYou rush to your house, and find your mother washing dishes in the kitchen.\nShe turns around and greets you, nonchalantly as if nothing happened and you didn’t go missing.\nYou ask her if she realized you were gone for the past 2 days, she says “No, did you go somewhere?”\nDejected, you leave and walk to the town square, searching around for someone, anyone happy to see you back.\nYour neighbors politely greet you, but are completely unaware that you ever went missing.You trudge home, safe, but distraught at just how easily your disappearance went overlooked by your friends and family.\nMaybe if you were just a bit more remarkable, a little better at math, people would have noticed your absence. (ENDING ⅔)");
      System.out.println("You scored "+points+"total points!");
      System.out.println("If you'd prefer a different fate, maybe try taking on this adventure once again by pressing Y or N...")
      String choice = scanner.nextLine();
      String choice = input.nextLine().toUpperCase();
      if(choice=="Y"){
        PreGameInfo.runGame = false;
      }
      else{
        scanner.close();
        System.out.println("Thank you for playing! See you next time!");
        
      

    
