import java.util.Scanner;
public class numSeries {
        public static void main(String[] args){
            String userInput;
            double average;
            int numCount = 0;
            double sum = 0.0;
            boolean isNumber;
            Scanner scnr = new Scanner(System.in);
            System.out.println("Please put in the next number or quit");
            userInput = scnr.next().toUpperCase();
            while (!userInput.equals("QUIT")){
                try {
                    Double.parseDouble(userInput);
                    isNumber = true;
                } catch (NumberFormatException e) {
                    isNumber = false;
                }
                if (isNumber){
                    sum += Double.parseDouble(userInput);
                    numCount++;
                    average = sum/numCount;
                    System.out.printf("%4.3f\n",average);
                    System.out.println("Please put in the next number or quit");
                } else {
                    System.out.println("Invalid entry :(");}
                userInput = scnr.next().toUpperCase(); //Fix dumbass (Locale) 
            }
            System.out.println("Shouldn't be here yet");  
        scnr.close();
    }


}