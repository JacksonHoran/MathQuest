import java.util.Random;

public class MathProblem {

    private static final double EPSILON = 1E-6;

    /*
     * makes a math problem with randomized operators and integer values,
     * uses the random library to randomly choose the integers and uses a random
     * boolean
     * to decide which combinations of operators to use. the method uses a ternary
     * operator instead of an if/else statement to decide which equations skeleton
     * to use
     * the method returns true or false based on whether the user's answer is
     * correct or incorrect.
     */
    public static boolean createMathProblem_Dif1() {
        Random random = new Random();
        // gets all the random info
        int num1 = random.nextInt(10) + 1;
        int num2 = random.nextInt(10) + 1;
        char operators = random.nextBoolean() ? '+' : '-';

        // chooses the equation format
        int result = operators == '+' ? num1 + num2 : num1 - num2;

        // shows the user the equation
        System.out.println("SOLVE THIS PROBLEM TO GET PAST THE MONSTER!");
        if (operators == '+') {
            System.out.println(num1 + " + " + num2);
        } else {
            System.out.println(num1 + " - " + num2);
        }

        // returns whether user is correct or not
        int userAnswer = PreGameInfo.input.nextInt();
        return userAnswer == result;
    }

    /*
     * makes a math problem with randomized operators and integer values,
     * uses the random library to randomly choose the integers and uses a random
     * boolean
     * to decide which combinations of operators to use. the method uses a ternary
     * operator instead of an if/else statement to decide which equations skeleton
     * to use
     * the method returns true or false based on whether the user's answer is
     * correct or incorrect.
     */
    public static boolean createMathProblem_Dif2() {
        Random random = new Random();
        // gets all random info
        int num1 = random.nextInt(10) + 1;
        int num2 = random.nextInt(10) + 1;
        int num3 = random.nextInt(50) + 1;
        char operators = random.nextBoolean() ? '*' : '+';

        // chooses equation skeleton
        int result = operators == '*' ? (num1 * num2) + num3 : num1 + num2 + num3;

        // shows user the equation
        if (operators == '*') {
            System.out.println("(" + num1 + " * " + num2 + ")" + " + " + num3);
        } else {
            System.out.println(num1 + " + " + num2 + " + " + num3);
        }

        // returns whether user is correct or incorrect
        int userAnswer = PreGameInfo.input.nextInt();
        return userAnswer == result;
    }

    /*
     * makes a math problem with randomized operators and integer values,
     * uses the random library to randomly choose the integers and uses a random
     * boolean
     * to decide which combinations of operators to use. the method uses a ternary
     * operator instead of an if/else statement to decide which equations skeleton
     * to use
     * the method returns true or false based on whether the user's answer is
     * correct or incorrect.
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
        System.out.println("SOLVE THIS PROBLEM TO GET PAST THE MONSTER!");
        if (operators == '*') {
            // if multiplication operator, print division then addition
            System.out.println("(" + "(" + num1 + " * " + num2 + ")" + " - " + num3 + ")" + " + " + num4);
        } else {
            // if addition operator, print multiplication then subtraction
            System.out.println("(" + "(" + num1 + " * " + num2 + ")" + " * " + num3 + ")" + " - " + num4);
        }

        // returns whether or not the user is correct
        int userAnswer = PreGameInfo.input.nextInt();
        return userAnswer == result;
    }

    /*
     * this method will call the correct difficulty math problem method based
     * on the users input. This method takes the users chosen difficulty as a
     * parameter
     * and prints the math problem to the console.
     */
    public static boolean getMathProblem(int difficulty) {
        boolean isCorrect = false;

        while (true) {
            if (difficulty == 1) {
                isCorrect = createMathProblem_Dif1();
            } else if (difficulty == 2) {
                isCorrect = createMathProblem_Dif2();
            } else if (difficulty == 3) {
                isCorrect = createMathProblem_Dif3();
            } else {
                System.out.println("Invalid difficulty level. Choose 1, 2, or 3.");
            }
            return isCorrect;
        }
    }
}