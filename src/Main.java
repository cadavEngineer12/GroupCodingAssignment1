import java.io.File;
import java.io.FileNotFoundException;
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
        char[][] grid = read.fileToCharArray();
        read.displayCharArray(grid);
        System.out.println("\nPlease enter the word you are looking for:");
        String word = scr.nextLine();
        System.out.println(read.isTargetInArray(word, grid));
        scr.close();
    }
}