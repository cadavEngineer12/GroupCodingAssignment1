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

    /**
     * Converts the grid text file into a 2D char array
     * @return returns a 2D char array (char[][])
     * @throws FileNotFoundException If source is not found throw FileNotFoundException
     * @author Charles Davis, Ashton Hairston
     */
    public char[][] fileToCharArray() throws FileNotFoundException {
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
        return arr;
    }

    /**
     * Method to display 2D char array
     * @param arr (2D char array)
     * @author Charles Davis, Ashton Hairston
     */
    public void displayCharArray(char[][] arr) {
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }
    }

    public boolean isTargetInArray(String target, char[][] arr) {
        char[] targetArr = target.toCharArray();

        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                //this boolean expression uses some math to make sure
                //there is enough space for the string to be there
                //if the amount of space left isnt enough space to fight the string
                //it will check the next position around our current element in a clockwise fasion
              if(((arr.length - row) - target.length() >= 0)){
                  //call wordSearch method here
              }
            }
        }
        return false;
    }

    /*
    private boolean wordSearch
            (int row, int col, int shiftRow, int shiftCol, char[] targetArr, char[][] arr){

    } */
}