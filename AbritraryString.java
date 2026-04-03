import java.util.Arrays;
import java.util.Scanner;
public class AbritraryString{
    public static void main(String[] args) {
        int currentNumElements = 0;
        String[] theStrings = new String[1];
        String tempString = scnr.NextLine();
        if  (currentNumElemenets >= theStrings.length) {
            String[] biggerStringArray =  new String[theStrings.length +1];
            int i = 0;
            while (i < theStrings.length) {
                biggerStringArray[i] = theStrings[i];
                i++;
            }
            theStrings = biggerStringArray;

        }
        theStrings[currentNumElements] = tempString;
        currentNumElements + 1;
        int i =0;
        
        System.out.print();
}   