import java.util.Scanner;
public class SineWaveVersion1Version1 {
    
    public static void main(String[] args) {
        Double num=0.0;
        Double pi = Math.PI;
        Scanner scnr = new Scanner(System.in);
        Double period = (2*pi)/scnr.nextInt();
        while (num*pi < 4*pi){
            //System.out.println(Math.sin(num*pi));
            Double inputSinifiedNumber = Math.sin(2*num*pi);
            if (inputSinifiedNumber <= -pi) 
                {System.out.printf("  .   \n");}
            else if (inputSinifiedNumber <= -pi/4) 
                {System.out.printf("   . \n");}
            else if (inputSinifiedNumber <= -pi/2) 
                {System.out.printf("    .\n");}
            else if(inputSinifiedNumber==0)
                {System.out.printf("  .  \n");}
            else if(inputSinifiedNumber <= pi/4)
                {System.out.printf(" .   \n");}
            else if(inputSinifiedNumber <= pi/2)
                {System.out.printf(".    \n");}
            num += 0.1;
        }
    }


}