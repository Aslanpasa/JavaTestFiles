import java.util.Scanner;
public class BarGraph{
    public static void main(String[] args) {
        String userInput;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please input bar length:");
        userInput = scnr.next();
        while (!userInput.equals("QUIT")){
            for (int count = 1; count<Double.parseDouble(userInput);count++){
                System.out.print("_");
            }
            for (int count = 1; count<Double.parseDouble(userInput);count++){
                System.out.print("_");
            }
            System.out.println("|\n");
            System.out.println("Please input bar length:");
            userInput = scnr.next();
        }
        scnr.close();
        

    }


}