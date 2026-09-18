import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 * Brings the file reader and searches for a certain word
 * @author Charles Davis, Angel Ortiz, Ashton Hariston, Keiren Phillips
 * @version 4.0
 */
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scr = new Scanner(System.in);
        File file = new File("grid.txt");
        fileReader read = new fileReader(file);
        System.out.println("Please enter the word you are looking for: ");
        String word = scr.nextLine();
        read.searchWord();

    }
}