import java.util.Scanner;

public class NestedLoops {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int numRows;
      int numColumns;
      int currentRow;
      char currentRowLetter;
      int currentColumn;
      int currentColumnInteger;
   
      numRows = scnr.nextInt();
      numColumns = scnr.nextInt();

      currentRowLetter = 'A';
      for (currentRow = 0; currentRow < numRows; currentRow++) {
         currentColumnInteger = 1;
         for(currentColumn=0;currentColumn<numColumns;currentColumn++) {
            
            System.out.print("" + currentRowLetter+currentColumnInteger + " ");
            currentColumnInteger++;
         }
         currentRowLetter++;
         System.out.print("\n");
      }
      scnr.close();

   }
}