import java.util.Random;
import java.util.Scanner;


public class MathProblem{
   
    /* makes a math problem with randomized operators and integer values
     * this will use the random library to randomly choose the order of the operators 
     * ,the numbers in the expression and the type of the math problem. there will be 
     * for example three or four differnt style maht problems. all of these three methods
     *  will work the same except that they will each create problems of different difficulty
     */
    public static boolean createMathProblem_Dif1(){
       Random random = new Random();
       Scanner input = new Scanner(System.in);

       int num1 = random.nextInt(10)+1;
       int num2 = random.nextInt(10)+1;
       char operators = random.nextBoolean() ? '+': '-';

       int result  = operators == '+' ? num1+num2: num1-num2;
       if (operators == '+'){
        System.out.println("SOLVE THIS PROBLEM TO GET PAST THE MONSTER!");
        System.out.println(num1 + "+" + num2);
       }else{
        System.out.println("SOLVE THIS PROBLEM TO GET PAST THE MONSTER!");
        System.out.println(num1 + "+" + num2);
       }
    
       int userAnswer = input.nextInt();
       return userAnswer == result;
    }

    public static boolean createMathProblem_Dif2(){ 
        Random random = new Random();
        Scanner input = new Scanner(System.in);


        int num1 = random.nextInt(10)+1;
        int num2 = random.nextInt(10)+1;
        int num3 = random.nextInt(50)+1;
        char operators = random.nextBoolean() ? '*': '+';

        int result  = operators == '*' ? (num1*num2)+num3: num1+num2+num3;

        if(operators == '*'){
            System.out.println("SOLVE THIS PROBLEM TO GET PAST THE MONSTER!");
            System.out.println( "(" + num1 + "*" + num2 + ")" + "+" + num3);
        }else{
            System.out.println("SOLVE THIS PROBLEM TO GET PAST THE MONSTER!");
            System.out.println(num1 + "+" + num2 + "+" + num3);
        }
        int userAnswer = input.nextInt();
        return result == userAnswer;
    }

    public static boolean createMathProblem_Dif3(){
        Random random = new Random();
        Scanner input = new Scanenr();

        int num1 = random.nextInt(12)+1;
        int num2 = random.nextInt(12)+1;
        int num3 = random.nextInt(12)+1;
        int num4 = random.nextInt(99)+1;
        char operators = random.nextBoolean() ? '*': '+';

        int result  = operators == '*' ? ((num1*num2)/num3)+num4: ((num1/num2)*num3)+num4;

        if(operators == '*'){
            System.out.println("SOLVE THIS PROBLEM TO GET PAST THE MONSTER!");
            System.out.println("(" + "(" + num1 + "*" + num2 + ")" + "/" + num3 + ")" + "+" + num4);
        }else{
            System.out.println("SOLVE THIS PROBLEM TO GET PAST THE MONSTER!");
            System.out.println("(" + "(" + num1 + "/" + num2 + ")" + "*" + num3 + ")" + "+" + num4);
        }
        int userAnswer = input.nextInt();
        return result == userAnswer;
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
