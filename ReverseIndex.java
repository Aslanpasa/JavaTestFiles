import java.util.Scanner;
public class ReverseIndex{
    
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int[] array = new int[3];
        for (int i = 0; i < array.length;i++){
            array[i] = scnr.nextInt();
        } 
        for (int i = array.length-1; i >= 0;i--){
            System.out.print(array[i]);
        }      
    }
}   