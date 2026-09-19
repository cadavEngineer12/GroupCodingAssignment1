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
        System.out.println("This is the grid: ");
        read.displayCharArray(read.fileToCharArray());
        System.out.println();
        System.out.println("Please enter the word you are looking for. (Case Sensitive)");
        String word = scr.nextLine();
        System.out.println(read.isTargetInArray(word, read.fileToCharArray()));
    }
}