public class EnemyEncounter {


    public static int points = 0; // Tracks player's points earned through correct answers
    public static int attemptCounter = 0; // Counts attempts per encounter
    public static boolean gameRunning = true; // Controls if the game is active
    public static int livesCounter; // tracks number of liveds player has left

    /* 
    helper method that initializes a count for the amount of lives the player gets.
    1 life for easy mode, 2 for medium and 3 lives for hard mode
    */
    public static void livesCounterInit() {
        //if user selects easy mode
        if (PreGameInfo.difficulty == 1) { 
            livesCounter = 1; //add one to life counter
        //if user selects medium mode
        } else if (PreGameInfo.difficulty == 2) { 
            livesCounter = 2; //add two to life counter
        //if user selects hard mode
        } else { 
            livesCounter = 3; //add three to life counter
        }
    }

    /*
    method that simulates an encounter with a monster.
    
    initializes an attempt counter
    initaizes a correct answer boolean to false
    prints ASCII picture

    while correctAnswer is false, attemps are less than 4, and game is running
        increment attempt counter by one
        get mathproblem, 
            if user is correct
                call calculate points
                correctAnswer = true
                increment pathsTraversed by one
            if user is wrong and they reach max attempts
                inform user they are wrong and the monster won
                increment pathsTraversed by one
            else
                tell user theyre wrong, and get another math equation.
                
        if the user attempted 4 or more times, call loseLife()
    
    */
    public static void encounter(int difficulty) {
        attemptCounter = 0; // Resets attempts for the current encounter
        boolean correctAnswer = false;
        MonsterPrinter.printRandomMonster();

        while (!correctAnswer && attemptCounter < 4 && PreGameInfo.runGame) {
            attemptCounter++;
            // if user gets math problem calculate points based off attempts
            if (MathProblem.getMathProblem(difficulty)) {
                calculatePoints(); // Adds points based on number of attempts
                correctAnswer = true;
                Main.pathsTraversed += 1;
            // if wrong and max attemps reached
            } else if (attemptCounter == 4) {
                // increent pathsTraversed by one
                System.out.println("Incorrect! The Monster defeated you!");
                Main.pathsTraversed += 1;
            // if wrong but attemps less than 4
            } else {
                System.out.println("Incorrect!");
                System.out.println();
            }
        }

        // Checks if the maximum attempts have been reached to lose a life
        if (attemptCounter >= 4) {
            loseLife();
        }
    }


    /*
    this method helps implement a "life" system.
    when this method is called the static varible named livesCounter is decremented by one

    next the method checks if the user has run out of lvies by using an if/else statement.
    if the user has run out of lives, the game is ended by setting pathsTeaversed to 100 which 
    will end the while that runs that runs the game portion of the program

    if the user still has at least one life left, they are given a mesage letting them know that 
    they were beat by the monster and they have x amount of lives left.
    */
    
    private static void loseLife() {
        livesCounter--; // decrement a life

        if (livesCounter <= 0) {
            // game over if no lives remain
            System.out.println();
            System.out.println("Game over, you've lost all your lives.");
            Main.pathsTraversed = 100;
        } else {
            // print remaining lives if any are left
            System.out.println("The monster beat you, you have " + livesCounter + " lives left.");
        }
    }

    /*
    This is a helper method to add to the users points total when they answer a 
    math question correctly.

    this uses chain of if/else statements to add points to the user game total 
    depending on how many attempts they have used.
    */
    private static void calculatePoints() {
        if (attemptCounter == 1) { // one attempt
            points += 4; //add 4
        } else if (attemptCounter == 2) { // two attempts
           points += 3; // add 3
        } else if (attemptCounter == 3) { // three attemps
            points += 2; // add 2 
        } else { // four attempts
            points += 1; //add 1
        }
    }
}
