import java.util.Arrays;

public class SinArrayVersion{
    
    public static void main(String[] args) {
        int consoleWidth = 106;
        int consoleHeight = 14;
        double mathSinAmp = 2;
        double mathSinPer = 1;
        double increment = mathSinAmp/consoleHeight;
        //System.out.println(increment);
        double maxNum = increment;
        int[][] consoleArray = new int[consoleHeight][consoleWidth];
        for (int indexHeight = 0; indexHeight < consoleHeight;indexHeight++) {
            for (int indexWidth = 0; indexWidth < consoleWidth;indexWidth++) {
                double yValue = (mathSinAmp * Math.sin( indexWidth*0.1 * mathSinPer) + mathSinAmp);
                if (yValue > (maxNum - increment)&& yValue < maxNum) {
                    
                    consoleArray[indexHeight][indexWidth] = 1;

                }
                System.out.println(yValue);
            }
            maxNum += increment;

        }
        String stringifiedArray = Arrays.deepToString(consoleArray);
        stringifiedArray = stringifiedArray.replace(",","");
        stringifiedArray = stringifiedArray.replace(" ","");
        stringifiedArray = stringifiedArray.replace("[","");
        stringifiedArray = stringifiedArray.replace("]","\n");
        stringifiedArray = stringifiedArray.replace("0"," ");
        stringifiedArray = stringifiedArray.replace("1","*");
        System.out.print(stringifiedArray);
           
    }
}   