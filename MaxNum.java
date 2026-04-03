import java.util.Scanner;
public class MaxNum{
    public static void main(String[] args) {
        double maxNumber = 0;
        double sndMaxNumber = 0;
        String userInput;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please input a number: ");
        userInput = scnr.next().toUpperCase();
        Boolean isNumber;
        while (!userInput.equals("QUIT")){
             try {
                    Double.parseDouble(userInput);
                    isNumber = true;
                } catch (NumberFormatException e) {
                    isNumber = false;
             }
            if (isNumber) {
               if (Double.parseDouble(userInput) > maxNumber){
                    sndMaxNumber = maxNumber;
                    maxNumber = Double.parseDouble(userInput);

               } else if (Double.parseDouble(userInput) > sndMaxNumber) {
                    sndMaxNumber = Double.parseDouble(userInput);

                } else {}
                System.out.println(sndMaxNumber);
            }
           
            userInput = scnr.next().toUpperCase();
            System.out.println("Please input a number: ");
        }
    }


}