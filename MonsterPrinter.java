import java.io.*;
import java.util.Random;

public class MonsterPrinter {


    /*
    this method reads a txt file from the Monsters directory and prints the ASCII pictures line by line.
    the methos uses scanner inside the try/catch block to get the file. if the file is not found, a 
    filenotfoundexception is thrown. The method prints output.nextLine so long as the scanner has a line to print.

    
    ASCII photos from - https://www.asciiart.eu/
    Also used - https://stackoverflow.com/questions/47293754/using-try-catch-for-files-in-java
              - https://stackoverflow.com/questions/19307622/java-says-filenotfoundexception-but-file-exists
    */
    public static void printRandomMonster() {

        // initialize random instance 
        Random random = new Random();

        // prints narration 
        System.out.println();
        System.out.println("Oh no! There's a monster down that path!");
        System.out.println("Look out!!!");
        System.out.println();
        System.out.println("SOLVE THIS MATH PROBLEM TO DEFEAT THE MONSTER!!");
        System.out.println();

        // randomly selects a monster ASCII
        int num = random.nextInt(10) + 1;
        String fileName = "C:/COMP170+271/COMP170+271/_my_Java_programs/src/MathQuest/Monsters/monster" + num + ".txt";

        // new scanner instance set to null because it gets closed by the try statement prematurely if it is created inside of it
        Scanner170 output = null;

        // try/catch to get file
        try {
            output = new Scanner170(new File(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while opening the file.");
            return;
        }

        // prints txt file line by line
        while (output.hasNextLine()) {
            System.out.println(output.nextLine());
        }

        // close scanner to prevent bugs
        output.close();
    }
}
