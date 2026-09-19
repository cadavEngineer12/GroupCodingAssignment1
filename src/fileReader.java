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
     * @author Charles Davis, Ashton Hairston
     *
     * @return returns a 2D char array (char[][])
     * @throws FileNotFoundException If source is not found throw FileNotFoundException
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
     *@author Charles Davis, Ashton Hairston
     *
     * @param arr (2D char array)
     */
    public void displayCharArray(char[][] arr) {
        for (int x = 0; x < arr.length; x++) {
            for (int y = 0; y < arr[x].length; y++) {
                System.out.print(arr[x][y] + " ");
            }
            System.out.println();
        }
    }

    /**
     * Searches 2D array for target string
     * @param target The word that is being searched for.
     * @param arr The array we are searching through
     * @return boolean: true if target is found, false otherwise
     */
    public boolean isTargetInArray(String target, char[][] arr) {
        char[] targetArr = target.toCharArray();
        boolean answer = false;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                //loop though each pos of the char[][].
                //if we find a char in the 2D arr that matches the first char of target
                //call wordSearch and check every direction around the current pos
                if(arr[row][col] == targetArr[0]) {
                    //search right
                    answer = wordSearch(row, col, 1, 0, targetArr, arr);
                }
                if(arr[row][col] == targetArr[0] && answer != true) {
                    //search bottom right
                    answer = wordSearch(row, col, 1, 1, targetArr, arr);
                }
                if(arr[row][col] == targetArr[0] && answer != true) {
                    //search bottom
                    answer = wordSearch(row, col, 0, 1, targetArr, arr);
                }
                if(arr[row][col] == targetArr[0] && answer != true) {
                    //search bottom left
                    answer = wordSearch(row, col, -1, 1, targetArr, arr);
                }
                if(arr[row][col] == targetArr[0] && answer != true) {
                    //search left
                    answer = wordSearch(row, col, -1, 0, targetArr, arr);
                }
                if(arr[row][col] == targetArr[0] && answer != true) {
                    //search top left
                    answer = wordSearch(row, col, -1, -1, targetArr, arr);
                }
                if(arr[row][col] == targetArr[0] && answer != true) {
                    //search top
                    answer = wordSearch(row, col, 0, -1, targetArr, arr);
                }
                if(arr[row][col] == targetArr[0] && answer != true) {
                    //search top right
                    answer = wordSearch(row, col, 1, -1, targetArr, arr);
                }
            }
        }
        return answer;
    }

    /**
     * This method takes in a 2D char array, a target char[], the location of the 2D array
     * you wish to start at, and the direction you wish to search. It converts the string into
     * an array and then compares the element of starting location and the first element
     * of the "String" you are searching for.
     * @author Ashton Hairston
     *
     * @param row Row number that we want to start our search on
     * @param col Column number that we want to start our search on
     * @param shiftRow The amount that row will shift each iteration of the loop
     * @param shiftCol The amount that col will shift each iteration of the loop
     * @param targetString The char[] that is the word you want to search for
     * @param arr The 2D char array (char[][]) that we are searching through
     * @return Returns true if the word is found, returns false if not.
     */
    private boolean wordSearch
            (int row, int col, int shiftRow, int shiftCol, char[] targetString, char[][] arr) {
        int targetIndex = 0;
        while (row < arr.length && col < arr[row].length && targetIndex < targetString.length
                && row >= 0 && col >= 0) {
            if (arr[row][col] != targetString[targetIndex]) {
                return false;
            }
            row += shiftRow;
            col += shiftCol;
            targetIndex++;
        }
        return true;
    }
}