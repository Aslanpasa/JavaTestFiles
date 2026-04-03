import java.util.Scanner;

public class LabProgram {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double weightingDayOne;
      double weightingDayTwo;
      System.out.println("Please enter expected temperature, rain and humidity for Day 1:");
      double temprDayOne = Double.parseDouble(scnr.next());
      int rainDayOne = Integer.parseInt(scnr.next());
      int percHumidityDayOne = Integer.parseInt(scnr.next());
      System.out.println("Please enter expected temperature, rain and humidity for Day 2:");
      double temprDayTwo = Double.parseDouble(scnr.next());
      int rainDayTwo = Integer.parseInt(scnr.next());
      int percHumidityDayTwo = Integer.parseInt(scnr.next());
      scnr.close();
      weightingDayOne = 0.0;
      if (temprDayOne < 15) {
         weightingDayOne += 2 * 3;
      } else if(temprDayOne < 25) {
         weightingDayOne += 3 * 3;
      } else if(temprDayOne >= 25) {
         weightingDayOne += 1 * 3;
      }
      if (rainDayOne < 4) {
         weightingDayOne += 3 * 2;
      } else if(rainDayOne < 9) {
         weightingDayOne += 2 * 2;
      } else if(rainDayOne >= 9) {
         weightingDayOne += 1 * 2;
      }
      if (percHumidityDayOne < 46) {
         weightingDayOne += 3;
      } else if(percHumidityDayOne < 61) {
         weightingDayOne += 2;
      } else if(percHumidityDayOne >= 61) {
         weightingDayOne += 1;
      }
      System.out.println("Outcome score day 1: " +weightingDayOne);
      weightingDayTwo = 0.0;
      if (temprDayTwo < 15) {
         weightingDayTwo += 2 * 3;
      } else if(temprDayTwo < 25) {
         weightingDayTwo += 3 * 3;
      } else if(temprDayTwo >= 25) {
         weightingDayTwo += 1 * 3;
      }
      if (rainDayTwo < 4) {
         weightingDayTwo += 3 * 2;
      } else if(rainDayTwo < 9) {
         weightingDayTwo += 2 * 2;
      } else if(rainDayTwo >= 9) {
         weightingDayTwo += 1 * 2;
      }
      if (percHumidityDayTwo < 46) {
         weightingDayTwo += 3;
      } else if(percHumidityDayTwo < 61) {
         weightingDayTwo += 2;
      } else if(percHumidityDayTwo >= 61) {
         weightingDayTwo += 1;
      }
      System.out.println("Outcome score day 1: " +weightingDayTwo);
      if (weightingDayOne > weightingDayTwo) {
         System.out.print("The best day to hold your event is: Day 1");
      } else if (weightingDayOne == weightingDayTwo) {
         System.out.print("The best day to hold your event is: Day 1 or Day 2");
      } else {
         System.out.print("The best day to hold your event is: Day 2");
      }
   }  
}