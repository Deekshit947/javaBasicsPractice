import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class checkedException {
    public static void main(String[] args) {
        try {
            File file = new File("missing.txt"); // file does not exist
            Scanner sc = new Scanner(file);      // throws FileNotFoundException
                while (sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }
                sc.close();
            } catch (FileNotFoundException e) {
                System.out.println("File not found: " + e.getMessage());
        }
    }
}
