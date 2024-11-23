
public class Ending {

  public static boolean restartGame;

  public static void showEnding(int totalPoints) {
    String endingMessage;
    String userScore = PreGameInfo.userName + ", you scored " + totalPoints + " total points!";
    if (totalPoints <= 12) {
      endingMessage = "You find yourself here, home at last!! However, all is quiet..."
          + "\nIt appears nobody is around…. Where could they be??"
          + "\nYou hear a commotion come from behind one of your neighbors homes…."
          + "\nYou go to investigate, only to find the monster that has eaten your entire village!!"
          + "\nIt appears you took too long on your journey home, leaving time for this monster to eat"
          + "\neveryone you know!! As the creature approaches you, teeth bared, it growls. Maybe if you "
          + "\nwere a little better at math, this wouldn’t have happened… You close your eyes, realizing he’s "
          + "\nright, and accept your fate.";
    } else if (totalPoints <= 15) {
      endingMessage = "You excitedly rush towards your village, relieved to be home."
          + "\nYou rush to your house, and find your mother washing dishes in the kitchen. "
          + "\nShe turns around and greets you, nonchalantly as if nothing happened and you didn’t go missing. "
          + "\nYou ask her if she realized you were gone for the past 2 days, she says \"No, "
          + "\ndid you go somewhere?\" Dejected, you leave and walk to the town square, searching around "
          + "\nfor someone, anyone happy to see you back. Your neighbors politely greet you, but are completely "
          + "\nunaware that you ever went missing.You trudge home, safe, but distraught at just how easily your "
          + "\ndisappearance went overlooked by your friends and family. Maybe if you were just a bit more "
          + "\nremarkable, a little better at math, people would have noticed your absence.";
    } else {
      endingMessage = "Triumphantly, you return home to celebrations and joyous greetings!"
          + "\nYou are hailed as a hero for overcoming impossible odds.";
    }

    System.out.println(endingMessage);
    System.out.println();
    System.out.println(userScore);
    System.out.println();
    PreGameInfo.input.nextLine();

    while (true) {
      System.out.println("Would you like to restart the game? Type Y or N.");
      String userChoice = PreGameInfo.input.nextLine().trim().toUpperCase();
      if (userChoice.equals("Y")) {
        restartGame = true;
        break;
      } else if (userChoice.equals("N")) {
        restartGame = false;
        break;
      } else {
        System.out.println("Invalid input, please try again.");
      }
    }
  }
}