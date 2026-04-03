import java.util.Scanner;

public class DateParser {
   public static int getMonthAsInt(String monthString) {
      int monthInt;                                                                
      monthInt = switch (monthString) {
           case "January" -> 1;
           case "February" -> 2;
           case "March" -> 3;
           case "April" -> 4;
           case "May" -> 5;
           case "June" -> 6;
           case "July" -> 7;
           case "August" -> 8;
           case "September" -> 9;
           case "October" -> 10;
           case "November" -> 11;
           case "December" -> 12;
           default -> 0;
       };
      
      return monthInt;
   }
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String inputDate = scnr.nextLine();
      String month;
      int day;
      int year;
      int lastIndexMonth;
      int inputLength = inputDate.length();
      int spaces;
      int commas;
      int indexPosition;
      while (!inputDate.equals("-1")){
         spaces = 0;
         commas = 0;
         for (indexPosition=0; indexPosition <inputLength-1;indexPosition++){
            switch (inputDate.charAt(indexPosition)){
               case ' ' -> spaces++;
               case ',' -> commas++;
            }
         }
         indexPosition = 0;
         if (spaces == 2 && commas ==1){
            while(inputDate.charAt(indexPosition)!=' ' && indexPosition != inputLength) {
               indexPosition++;
            }
            month = inputDate.substring(0,indexPosition);
            indexPosition++;
            lastIndexMonth = indexPosition;
            if(getMonthAsInt(month)!=0) {
               while (inputDate.charAt(indexPosition)!=',' && indexPosition != inputLength) {
                  indexPosition++;
               }
               day = Integer.parseInt(inputDate.substring(lastIndexMonth,indexPosition));
               year = Integer.parseInt(inputDate.substring(indexPosition+2,inputLength));
               System.out.println(getMonthAsInt(month)+ "-" + day + "-"+year);
            }
         }
         inputDate = scnr.nextLine();
         inputLength = inputDate.length();
      }
      scnr.close();     
   }
}
