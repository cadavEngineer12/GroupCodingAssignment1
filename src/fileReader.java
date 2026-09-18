import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Class for reading and scanning a text file
 * @author Charles Davis, Angel Ortiz, Ashton Hariston, Keiren Phillips
 */
public class fileReader {
    private final File reader;


    public fileReader(File reader) {
        this.reader = reader;
    }

    public File getFile(File reader) {
        return reader;
    }

    public void searchWord() throws FileNotFoundException {
        Scanner scr = new Scanner(reader);
        String[] lines = scr.useDelimiter("\\A").next().split("\n");
        char[][] arr = new char[lines.length][];
        for (int row = 0; row < lines.length; row++) {
            String[] name = lines[row].trim().split(" ");
            arr[row] = new char[name.length];
            for (int column = 0; column < name.length; column++) {
                arr[row][column] = name[column].charAt(0);
            }
        }

        /*
         *section is meant for printing out the 2D arrays
         */
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }
    }
}
