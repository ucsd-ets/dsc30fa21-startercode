/**
 * Name: TODO
 * PID: TODO
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * TODO
 * @author TODO
 * @since TODO
 */
public class Startup {

    private static int NUM_SYMPTOMS=6;
    private static int NUM_FILES=3;

    public static String convertUnits(int option, String currentUnit, double value){
        /*TODO*/
        return null;
    }

    public static String removeComments(String input, char boundary){
        /*TODO*/
        return null;
    }

    public static String determineSeat(){
        /*TODO*/
        return null;
    }

    public static String processTransfer(int amount){
        /*TODO*/
        return null;
    }

    public static String decompressString(String input){
        /*TODO*/
        return null;
    }


    public static String calculateTime(String startTime, int[] intervals){
        /*TODO*/
        return null;
    }

    public static String summarizeResponse(String[][] responses){
        /*TODO*/
        return null;
    }

    public static void main(String[] args) {
        //Below are the tests for #7. Input files are already transformed into 2D array
        //Your task would be to get information from the array and summarize the responses in desired format
        //See input text and writeup for more details
        for(int i=0;i<NUM_FILES;i++){
            String path=String.format("src/students-092%d.txt",i+1);
            String[][] responses=readResponses(path);
            System.out.println("__________________________");
            System.out.println(summarizeResponse(responses));
        }
    }

    /**
     * Helper method to read the files
     * Don't change the code within it.
     * @return the student responses within the input file as a 2D String array
     */
    public static String[][] readResponses(String path){
        try {
            Scanner sc = new Scanner(new File(path));
            int numLines=0;
            while(sc.hasNextLine()){
                numLines++;
                sc.nextLine();
            }
            sc = new Scanner(new File(path));
            String[][] responses=new String[numLines][NUM_SYMPTOMS+1];
            int lineNum=0;
            while(sc.hasNextLine()){
                String s=sc.nextLine();
                responses[lineNum++]=s.split(",");
            }
            return responses;
        } catch (FileNotFoundException e) {
            System.out.println("File is not found. Below are the exact error messages");
            e.printStackTrace();
        }
        return null;
    }
}
