//import java.util.Random;
public class MathProblem {
   
    /* makes a math problem with randomized operators and integer values
     * this will use the random library to randomly choose the order of the operators 
     * ,the numbers in the expression and the type of the math problem. there will be 
     * for example three or four differnt style maht problems. all of these three methods
     *  will work the same except that they will each create problems of different difficulty
     */
    public static void createMathProblem_Dif1(){ 
       // Random random = new Random();
    }

    public static void createMathProblem_Dif2(){ 
    }

    public static void createMathProblem_Dif3(){
    }


    /*this method will call the correct difficulty math problem method based 
    on the users input. This method takes the users chosen difficulty as a parameter 
    and prints the math problem to the console. */
    public static void getMathprobem(int difficulty){
        if (difficulty == 1){   
            createMathProblem_Dif1();
        }else if(difficulty == 2){ 
        }else{  
            createMathProblem_Dif3();
        }
    }
}
