import java.util.Scanner;

public class PlusSignSeparatedValues {
   public static void main(String[] args) {
       try (Scanner scnr = new Scanner(System.in)) {
           int valCount;
           int inputVal;
           int i;
           
           valCount = scnr.nextInt();
           for(i=0; i<=valCount-1;i++){
               inputVal = scnr.nextInt();
               System.out.println(i);
               if ((valCount-1) != i){
                   System.out.print(inputVal+" + ");
               } else {
                   System.out.print(inputVal);
               }
               
           }
           System.out.println();
       }
   }
}