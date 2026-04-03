import java.util.Scanner;
public class DateParserVersion1 {
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
   public static void main(String[]args){
      String month;
      String day;
      String year;
      Scanner scnr = new Scanner(System.in);
      String inputDate = "Minch 2, 2008";
      int inputDateIndexLength = inputDate.length()-1;
      System.out.println(inputDateIndexLength);
      while (!inputDate.equals("-1")){
         int startNumber = 0;
         while((inputDate.charAt(startNumber)) != ' ' && startNumber < inputDateIndexLength){
            startNumber++;
         }
         System.out.println(startNumber);
         if (startNumber < inputDateIndexLength){
            int monthEnd = startNumber;
            month = inputDate.substring(0,startNumber);
            int monthNum = getMonthAsInt(month);
            while((inputDate.charAt(startNumber)) != ',' && startNumber < inputDateIndexLength && monthNum != 0){
               startNumber++;
            }
            System.out.println(startNumber);
            if (startNumber < inputDateIndexLength){
               int dayEnd =startNumber;
               day = inputDate.substring(monthEnd+1,dayEnd);
               startNumber++;
               startNumber++;
               year = inputDate.substring(dayEnd+2,inputDate.length());
               System.out.println(startNumber);
               System.out.println(monthNum + "-" + day + "-"+year);
            }
         }
         inputDate = scnr.nextLine();
      }
   }   
}