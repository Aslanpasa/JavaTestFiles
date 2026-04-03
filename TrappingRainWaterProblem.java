import java.util.Arrays;
import java.util.Scanner;
public class TrappingRainWaterProblem{

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput = "[3, 0, 1, 0, 4, 0, 2]"/*scnr.nextLine()*/;
        int numElements = 1;
        int maxNum = -1;
        for (int i = 0; i < userInput.length(); i++ ) {
            if (userInput.charAt(i) == ',') {
                numElements++;
            }           
        }
        int[] array = new int[numElements];
        int index = 0;
        for(int i = 0; i < userInput.length(); i++) {
            if(userInput.charAt(i) != '['&& userInput.charAt(i) != ']' && userInput.charAt(i) != ' ' && userInput.charAt(i) != ',') {
                array[index] = userInput.charAt(i)-'0';
                index++;
                }
            }
        Boolean exitCondition = false;
        int startHeight = array[0];
        int startPoint = 0;
        int filledUnits = 0;
        boolean exitInteriorCondition = false;
        index = 1;
        boolean shiftRequirement;
        int runNumber = 0;
        while (!exitCondition) {
            shiftRequirement = false;
            while (!exitInteriorCondition) {
                exitInteriorCondition = startHeight > array[index] && index < numElements;
                if ((numElements >= index)) {
                    System.out.print(index);
                    shiftRequirement = true;
                    exitInteriorCondition = true;
                }
                System.out.print(index+ "iadjioa");
                index++;
            }
            if (shiftRequirement == false) {
                for(int i = 1; i < index; i++) {
                filledUnits += startHeight - array[i];
                } 
                startPoint = index;
            } else if (shiftRequirement == true && index == numElements){
                 exitCondition = true;
              
            } else if (shiftRequirement == true) {
                 startPoint = startPoint + 1;
               }
            runNumber++;
            if (startPoint < array.length){startHeight = array[startPoint];}
            else {break;}
            System.out.println("Run #" + runNumber + "\nInformation: ");
            System.out.println(startPoint + "|" + startHeight);
            System.out.println(shiftRequirement + "|" + index);
            if(runNumber == 100) {
                break;
            }
            
           
        }
        System.out.print(filledUnits);
        String stringifiedArray = Arrays.toString(array);
        System.out.println(stringifiedArray);
        }
        
        
    }
   