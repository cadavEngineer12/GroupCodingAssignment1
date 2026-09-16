import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Class for reading and scanning a text file
 * @author Charles Davis
 */
public class fileReader {
    private final File reader;


    public fileReader(File reader) {
        this.reader = reader;
    }

    public File getFile(File reader) {
        return reader;
    }


    public void searchWord(String target) throws FileNotFoundException {
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
}
