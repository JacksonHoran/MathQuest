//import java.util.Random;
public class MathProblem {
   
    public static void createMathProblem_Dif1(){ //makes an easy math problem with randomized operators and integer values
       // Random random = new Random();
    }
    public static void createMathProblem_Dif2(){ // makes a medium difficulty math problem with randomized operators and integer values
        
    }
    public static void createMathProblem_Dif3(){ // makes a hard math problem with randomized operators and integer values
        
    }
    public static void getMathprobem(int difficulty){
        if (difficulty == 1){   //if the user picks easy, theyre given a randomly chosen easy problem
            createMathProblem_Dif1();
        }else if(difficulty == 2){ //if the user picks medium they are given a medium difficulty problem
            createMathProblem_Dif2();
        }else{  //if the user picks hard theyre given a hard math problem created with ranndom
            createMathProblem_Dif3();
        }
    }
}
