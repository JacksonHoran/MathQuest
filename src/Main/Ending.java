
public class Ending {

  public static void showEnding(int totalPoints) {

    if (EnemyEncounter.points <= 12) {
      System.out.println(
          "You find yourself here, home at last!! However, all is quiet..."
              + "\nIt appears nobody is around…. Where could they be??"
              + "\nYou hear a commotion come from behind one of your neighbors homes…."
              + "\nYou go to investigate, only to find the monster that has eaten your entire village!!"
              + "\nIt appears you took too long on your journey home, leaving time for this monster to eat"
              + "\neveryone you know!! As the creature approaches you, teeth bared, it growls. Maybe if you "
              + "\nwere a little better at math, this wouldn’t have happened… You close your eyes, realizing he’s "
              + "\nright, and accept your fate.(ENDING ⅓)");

      System.out.println("You scored " + EnemyEncounter.points + " total points!");
      System.out.println(
          "If you'd prefer a different fate, maybe try taking on this adventure once again by pressing Y or N...");
      String choice = PreGameInfo.input.nextLine().toUpperCase();
      if (choice.equalsIgnoreCase("Y")) {
        PreGameInfo.runGame = false;
      } else {
        System.out.println("Thank you for playing! See you next time!");
      }
    } else if (EnemyEncounter.points <= 15) {
      System.out.println(
          "You excitedly rush towards your village, relieved to be home."
              + "\nYou rush to your house, and find your mother washing dishes in the kitchen. "
              + "\nShe turns around and greets you, nonchalantly as if nothing happened and you didn’t go missing. "
              + "\nYou ask her if she realized you were gone for the past 2 days, she says \"No, "
              + "\ndid you go somewhere?\" Dejected, you leave and walk to the town square, searching around "
              + "\nfor someone, anyone happy to see you back. Your neighbors politely greet you, but are completely "
              + "\nunaware that you ever went missing.You trudge home, safe, but distraught at just how easily your "
              + "\ndisappearance went overlooked by your friends and family. Maybe if you were just a bit more "
              + "\nremarkable, a little better at math, people would have noticed your absence. (ENDING ⅔)");
      System.out.println("You scored " + EnemyEncounter.points + " total points!");
      System.out.println(
          "If you'd prefer a different fate, maybe try taking on this adventure once again by pressing Y or N...");
      String choice = PreGameInfo.input.nextLine();
      if (choice.equalsIgnoreCase("Y")) {
        PreGameInfo.runGame = false;
      } else {
        System.out.println("Thank you for playing! See you next time!");
      }
    } else if (EnemyEncounter.points >= 19) {
      System.out.println(
          "You excitedly rush towards your village, relieved to be home. "
              + "\nYou rush to your house, and find your mother washing dishes in the kitchen. "
              + "\nShe turns around and greets you, nonchalantly as if nothing happened and you didn’t "
              + "\ngo missing. You ask her if she realized you were gone for the past 2 days, she says "
              + "\n\"No, did you go somewhere?\" Dejected, you leave and walk to the town square, searching"
              + "\naround for someone, anyone happy to see you back. Your neighbors politely greet you, but are "
              + "\ncompletely unaware that you ever went missing. You trudge home, safe, but distraught at "
              + "\njust how easily your disappearance went overlooked by your friends and family. "
              + "\nMaybe if you were just a bit more remarkable, a little better at math, people would have "
              + "\nnoticed your absence. (ENDING ⅔)");
      System.out.println("You scored " + EnemyEncounter.points + " total points!");
      System.out.println(
          "If you'd prefer a different fate, maybe try taking on this adventure once again by pressing Y or N...");
      String choice = PreGameInfo.input.nextLine();
      if (choice.equalsIgnoreCase("Y")) {
        PreGameInfo.runGame = false;
      }
    } else {
      System.out.println("Thank you for playing! See you next time!");
    }
  }
}
