import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Brings the file reader and searches for a certain word
 * @author Charles Davis
 * @version 4.0
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("grid.txt");
        fileReader read = new fileReader(file);
        String word = "Hello";
        read.searchWord(word);

    }
}