
import java.util.Random;

public class MathProblem {

    /*
    This method creates a randomized math equation of a given difficulty.
    uses Random library to select two random integers beween 1 and 10. 
    the methos uses a ternary operator to determine which opertor to use.
    there are two instances of the ternary opertor here, first in line 34,
    a char named operators is set equal to a random choice between addition 
    or subtraction. The opertion works such that, after the variable's type 
    and name are determined, a boolean is expressed and if the boolean is true, 
    the first option after the ? is the value of the variable and if its false, 
    the second option after the colon is given tot he variable. in this case "operatos"
    is either set to '+' or '-'. th enext use of the ternary determines the result 
    variable by choosing between the two options of operations.

    All of the informaiton we accumulated on ternary opertors is from the textbook page 1183.

    After the random equation is determiend, the method prints the quation to the user 
    and calls the user answer method.

    The method returns true if the user answered the question correctly and false otherwise
    */
    public static boolean createMathProblem_Dif1() {

        // initalize random instance
        Random random = new Random();
        
        // gets all the random info
        int num1 = random.nextInt(10) + 1;
        int num2 = random.nextInt(10) + 1;
        char operators = random.nextBoolean() ? '+' : '-';

        // chooses the equation format
        int result = operators == '+' ? num1 + num2 : num1 - num2;

        // shows the user the equation
        System.out.println();
        System.out.println("SOLVE THIS PROBLEM TO GET PAST THE MONSTER!");
        if (operators == '+') {
            System.out.println(num1 + " + " + num2 + " = ?");
        } else {
            System.out.println(num1 + " - " + num2 + " = ?");
        }
        return userAnswer(result);
    }

    /*
    This method creates a randomized math equation of medium difficulty, similarly to the method above, 
    it uses random instances to determine the integer values and operators. ternary opertors are used to
    determine the opertors and the format of the equation
    
    All of the informaiton we accumulated on ternary opertors is from the textbook page 1183.

    After the random equation is determiend, the method prints the equation to the user 
    and calls the userAnswer method.

    The method returns true if the user answered the question correctly and false otherwise
    */
    public static boolean createMathProblem_Dif2() {

        // initialize random instance
        Random random = new Random();
        
        // gets all random info
        int num1 = random.nextInt(10) + 1;
        int num2 = random.nextInt(10) + 1;
        int num3 = random.nextInt(50) + 1;
        char operators = random.nextBoolean() ? '*' : '+';

        // chooses equation format
        int result = operators == '*' ? (num1 * num2) + num3 : num1 + num2 + num3;

        // shows user the equation
        System.out.println();
        System.out.println("SOLVE THIS PROBLEM TO GET PAST THE MONSTER!");
        if (operators == '*') {
            System.out.println("(" + num1 + " * " + num2 + ")" + " + " + num3 + " = ?");
        } else {
            System.out.println(num1 + " + " + num2 + " + " + num3 + " = ?");
        }
        return userAnswer(result);

    }

    /*
    This method creates a randomized math equation of hard difficulty, similarly to the method above, 
    it uses random instances to determine four integer values and three operators. ternary opertors are used to
    determine the opertors and the format of the equation
    
    All of the informaiton we accumulated on ternary opertors is from the textbook page 1183.

    After the random equation is determiend, the method prints the equation to the user 
    and calls the userAnswer method.

    The method returns true if the user answered the question correctly and false otherwise
     */
    public static boolean createMathProblem_Dif3() {
        Random random = new Random();

        // gets random info
        int num1 = random.nextInt(12) + 1;
        int num2 = random.nextInt(12) + 1;
        int num3 = random.nextInt(12) + 1;
        int num4 = random.nextInt(99) + 1;
        char operators = random.nextBoolean() ? '*' : '+';

        // chooses equation format
        int result = operators == '*' ? ((num1 * num2) - num3) + num4 : ((num1 * num2) * num3) - num4;

        // shows user the equation
        System.out.println();
        System.out.println("SOLVE THIS PROBLEM TO GET PAST THE MONSTER!");
        if (operators == '*') {
            // if multiplication operator, print division then addition
            System.out.println("(" + "(" + num1 + " * " + num2 + ")" + " - " + num3 + ")" + " + " + num4 + " = ?");
        } else {
            // if addition operator, print multiplication then subtraction
            System.out.println("(" + "(" + num1 + " * " + num2 + ")" + " * " + num3 + ")" + " - " + num4 + " = ?");
        }
        return userAnswer(result);
    }

    /*
    This method utilizes a switch statement to determine which createMathProblem method to call
    a switch statement is useful in a situation where you would like to use an if/else but you notice
    that it is very redundent. the switch statement uses less raw code to reach the same objective. It 
    is a god choice to use a switch statement when your if/else is dependent on one variable only, and 
    it exausts all possible values for said variable. 

    All of the information we accumulated on the switch statement is from the texbook page 1184.

    this method returns a boolean, it return whether or not the user answered the math question 
    correctly or not, or it default case returns false for invalid input
    */
    public static boolean getMathProblem(int difficulty) {
        // calls a different method based on all possible options of input for the difficuly variable.
        switch (difficulty) {
            case 1:
                return createMathProblem_Dif1();
            case 2:
                return createMathProblem_Dif2();
            case 3:
                return createMathProblem_Dif3();
            default:
                System.out.println("Invalid difficulty level. Please restart the game.");
                return false;
        }
    }

    
    /*
    This method checks whether or not the user answers the given quesiton correct or not. 
    the method uses a try/catch block to receive the input from the user. the Scanner170 instance here reads the whole line. 
    This is because when using multiple instances of the Scanner170 class can create isues woth text or characters 
    being left in the buffer. this strategy, receives the input as a string and parses it into an integer, 
    effectively getting the user answer in the correct type and clearing the buffer.

    the method returns true is the user is correct and false otherwise.

    try/catch - page 398, 1186
    "Integer.parseInt()" - https://stackoverflow.com/questions/5585779/how-do-i-convert-a-string-to-an-int-in-java 
    */
    private static boolean userAnswer(int correctAnswer) {
        //prompts user for answer
        System.out.print("Enter your answer: ");

        //initilaizes isCorrect
        boolean isCorrect = false;
        
        // gets inut from uer or throws exception 
        try {
            // Read input and parse it to an integer
            int userAnswer = Integer.parseInt(PreGameInfo.input.nextLine().trim());

            // checks for equality between the soulution and user answer
            if (userAnswer == correctAnswer) {
                System.out.println("Correct! You defeated the monster.");
                isCorrect = true;
            } else {
                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
        }

        return isCorrect;
    }
}
