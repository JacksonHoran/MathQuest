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
        String fileName = "src/Main/Monsters/monster" + num + ".txt"; // Build file path

        // Get the absolute path of the project root directory
        String projectRoot = System.getProperty("user.dir");

        // Build the full path to the file
        String fullPath = projectRoot + File.separator + fileName;

        // Debug: Print the full path
        System.out.println("Looking for file: " + fullPath);

        File file = new File(fullPath);

        // Check if the file exists before attempting to open it
        if (!file.exists()) {
            System.out.println("File not found: " + fullPath);
            return;
        }

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
