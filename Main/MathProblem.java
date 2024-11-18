import java.util.Random;
public class MathProblem {
   
    /* makes a math problem with randomized operators and integer values
     * this will use the random library to randomly choose the order of the operators 
     * ,the numbers in the expression and the type of the math problem. there will be 
     * for example three or four differnt style maht problems. all of these three methods
     *  will work the same except that they will each create problems of different difficulty
     */
    public static int createMathProblem_Dif1(){ 
       Random random = new Random();

       int num1 = random.nextInt(10)+1;
       int num2 = random.nextInt(10)+1;
       char operators = random.nextBoolean() ? '+': '-';

       int result  = operators == '+' ? num1+num2: num1-num2;
       return result;
    }

    public static int createMathProblem_Dif2(){ 
        Random random = new Random();

        int num1 = random.nextInt(50)+1;
        int num2 = random.nextInt(50)+1;
        char operators = random.nextBoolean() ? '*': '+';

        int result  = operators == '*' ? num1*num2: num1+num2;
       return result;
    }

    public static int createMathProblem_Dif3(){
        Random random = new Random();

        int num1 = random.nextInt(99)+1;
        int num2 = random.nextInt(99)+1;
        char operators = random.nextBoolean() ? '*': '+';

        int result  = operators == '*' ? num1*num2: num1/num2;
       return result;
    }


    /*this method will call the correct difficulty math problem method based 
    on the users input. This method takes the users chosen difficulty as a parameter 
    and prints the math problem to the console. */
    public static void getMathprobem(int difficulty){
        switch (difficulty) {
            case 1:
                createMathProblem_Dif1();
                break;
            case 2:
                createMathProblem_Dif2();
                break;
            case 3:
                createMathProblem_Dif3();
                break;
            default:
                System.out.println("Invalid difficulty level. Choose 1, 2, or 3.");
                break;
        }
    }
}
