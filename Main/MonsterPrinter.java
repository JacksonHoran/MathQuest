import java.io.File;
import java.util.Random;
import java.util.Scanner;

public class MonsterPrinter {

    public static void printRandomMonster() {
        Random random = new Random();
        System.out.println();
        System.out.println("Oh no! There's a monster down that path!");
        System.out.println("Look out!!!");
        System.out.println();
        System.out.println("SOLVE THIS MATH PROBLEM TO DEFEAT THE MONSTER!!");
        System.err.println();

        int num = random.nextInt(10) + 1;
        String fileName = "C:/COMP170+271/COMP170_271/_my_Java_programs/src/MathQuest/src/Main/Monsters/monster" + num + ".txt"; // Build file path

        Scanner output = null;

        try {
            output = new Scanner(file);
        } catch (Exception e) {
            System.out.println("An error occurred while opening the file.");
            e.printStackTrace();
            return;
        }

        while (output.hasNextLine()) {
            System.out.println(output.nextLine());
        }

        output.close();
    }
}
