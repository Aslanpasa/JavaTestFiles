import java.util.Scanner;

public class DropFirstThreeFields {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String stateFields;
      int i;
		int spaceCount = 0;
		int thirdSpace = -1;
   //Minnesota Connecticut Arizona Nebraska Vermont Florida
      stateFields = scnr.nextLine();
      boolean found = false;
      int charSlot = 0;
      while (!found && charSlot<stateFields.length()){         
         if (stateFields.charAt(charSlot)==' '){
            spaceCount++;
            }
         if (spaceCount == 3){
            thirdSpace = charSlot;
            found = true;
         }        
         charSlot++; 
      }
      scnr.close();

      System.out.println("Remaining fields: " + stateFields.substring(thirdSpace + 1));
   }
}