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
    private static int ASCII_ZERO=48;

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

    public static String summarizeResponse(String[] namesArray, boolean[][] responses){
        /*TODO*/
        return null;
    }

    public static void main(String[] args) {
        //Below are the tests for #7. Input files are already transformed into a namesArray and a response array
        //Your task would be to get information from the arrays and summarize the responses in desired format
        //See input text and writeup for more details
        for(int i=1;i<NUM_FILES+1;i++){
            String path=String.format("src/students-092%d.txt",i);
            int numLines=getNumberLines(path);
            String[] namesArray=new String[numLines];
            boolean[][] respArr=new boolean[numLines][NUM_SYMPTOMS];
            readResponses(path, namesArray, respArr);
            System.out.println("__________________________");
            System.out.println(summarizeResponse(namesArray, respArr));
        }
    }

    /**
     * helper method to count number of lines within the input file
     * Don't change the code within it.
     * @param path the input file path
     * @return the number of lines in the input file
     */
    public static int getNumberLines(String path){
        try {
            Scanner sc =new Scanner(new File(path));
            int numLines=0;
            while(sc.hasNextLine()){
                numLines++;
                sc.nextLine();
            }
            return numLines;
        } catch (FileNotFoundException e) {
            System.out.println("File is not found. Make sure input files is under the src folder");
            e.printStackTrace();
        }
        return -1;
    }

    /**
     * Helper method to read the files
     * Don't change the code within it.
     * @return the student responses within the input file as a 2D String array
     */
    public static void readResponses(String path, String[] namesArray, boolean[][] respArr){
        try {
            Scanner sc = new Scanner(new File(path));
            int lineNum=0;
            while(sc.hasNextLine()){
                String s=sc.nextLine();
                respArr[lineNum]=new boolean[NUM_SYMPTOMS];
                String[] values=s.split(",");
                for (int i=0;i<values.length;i++){
                    if(i==0){ namesArray[lineNum]=values[i];}
                    else{ respArr[lineNum][i-1]=((int)values[i].charAt(0)-ASCII_ZERO)==1;}
                }
                lineNum++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
