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
        for (int x = 0; x < lines.length; x++) {
            String[] name = lines[x].trim().split(" ");
            arr[x] = new char[name.length];
            for (int y = 0; y < name.length; y++) {
                arr[x][y] = name[y].charAt(0);
            }
        }
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }
    }

    /**
     * a method to check if the word is found!
     * @return true or false if the word is found
     */
    public boolean wordFound() {
        // check left right top bottom diagonal and return true or false if found
        // edge case if length is longer then length of array. check for out of bounds
        // exception


        return false;
    }

}
