import java.util.Scanner;
public class CeaserCypher {
    public static void main(String[] args) {
        String inputString;
        char charAtPoint;
        int shiftAmount;
        int charAtPointNum;
        String encodedString = "";
        Scanner scnr = new Scanner(System.in);
        System.out.println("What is the text you want to encode?");
        inputString = scnr.nextLine();
        System.out.println("How much do you want to shift it?");
        shiftAmount = Integer.parseInt(scnr.nextLine());
        for (int indexPosition = 0; indexPosition <= inputString.length()-1;indexPosition++)
        {
            charAtPoint = inputString.charAt(indexPosition);
            charAtPointNum = (int)charAtPoint;
            charAtPointNum += shiftAmount;
            System.out.printf("%c",(char)charAtPointNum);
            encodedString = encodedString.concat(Character.toString((char)charAtPointNum));
        }

        System.out.println();
        for (int indexPosition = 0; indexPosition <= inputString.length()-1;indexPosition++)
        {
            charAtPoint = encodedString.charAt(indexPosition);
            charAtPointNum = (int)charAtPoint;
            charAtPointNum -= shiftAmount;
            System.out.printf("%c",(char)charAtPointNum);
        }
        scnr.close();
    }

}