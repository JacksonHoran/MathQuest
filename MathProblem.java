
import java.util.Random;

public class MathProblem {


    public static boolean createMathProblem_Dif1() {
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


    // Method to select and call the appropriate math problem based on difficulty
    public static boolean getMathProblem(int difficulty) {
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

    // Method to validate the user's answer
    private static boolean userAnswer(int correctAnswer) {
        System.out.print("Enter your answer: ");
        boolean isCorrect = false;

        try {
            // Read input and parse it to an integer
            int userAnswer = Integer.parseInt(PreGameInfo.input.nextLine().trim());

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
