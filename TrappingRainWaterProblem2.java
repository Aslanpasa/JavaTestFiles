import java.util.Arrays;
import java.util.Scanner;
public class TrappingRainWaterProblem2{
     public static int[] stringToArray(String inputString) {
        int[] array = new int[numberOfElements(inputString)];
        int index = 0;
        for(int i = 0; i < inputString.length(); i++) {
            if(inputString.charAt(i) != '['&& inputString.charAt(i) != ']' && inputString.charAt(i) != ' ' && inputString.charAt(i) != ',') {
                array[index] = inputString.charAt(i)-'0';
                index++;
                }
        }
        return array;
     }
    public static int numberOfElements(String userInput) {
        int numElements =1;
        for (int i = 0; i < userInput.length(); i++ ) {
            if (userInput.charAt(i) == ',') {
                numElements++;
            }           
        }
        return numElements;

     }
     public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String userInput = "[3, 0, 2, 0, 2]"/*scnr.nextLine()*/;
        int maxNum = -1;
        int[] userArray = stringToArray(userInput);
        //Converts the string input to an array (Assumes comma delimitation)
        boolean exitCondition = false;
        int startIndex = 0;
        int startHeight;
        int endBound = 1;
        int index;
        int sumFilledSquares=0;
        boolean reversal = false;
        int finalReversalBoundry = 0;
        //Refers to the start of the block
        while(startIndex < userArray.length) {
            index = startIndex;
            startHeight = userArray[startIndex];
            index += 1;
            if (reversal == false) {
                while (index < userArray.length && startHeight > userArray[index]){
                index++;
                }
            } else if (reversal == true) {
                index = userArray.length - 1;
                
                while (finalReversalBoundry < userArray.length && startHeight > userArray[finalReversalBoundry]){
                    index--;
                    System.out.println(index);
                }
            }
            if (index >= userArray.length) {
                finalReversalBoundry = endBound;
            }
            //Determines the next highest or equal point
            endBound = index;
            if (endBound < userArray.length && reversal == false) {
                if (startHeight <= userArray[endBound]) {
                    for (index = startIndex+1; index < endBound;index++) {
                    sumFilledSquares += startHeight-userArray[index];
                    }
                }
            } else {
                reversal = true;
            }
            if (endBound > 0 && reversal == false) {startIndex = endBound;} 
        }
        System.out.println(sumFilledSquares);
        String stringifiedArray = Arrays.toString(userArray);
        System.out.println(stringifiedArray);
     }




}