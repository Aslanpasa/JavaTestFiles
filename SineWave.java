import java.util.Scanner;
public class SineWave{
    public static void main (String[] args) {
        double yPos;
        int displayOffset;
        double xPos = 0;
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please type the amplitude:");
        double amplitude = 1/*scnr.nextDouble()*/;
        System.out.println("Please type the period:");
        double period = 0.5/*scnr.nextDouble()*/;
        System.out.println("Please type whether you want vertical(1) or horizontal(2) :");
        String horizontalOrVertical = "1"/*scnr.nextLine()*/;
        if (horizontalOrVertical.equals("1")) {
            while (true/*xPos < 4*Math.PI*/) {
                //yPos = Math.abs(amplitude*(Math.sin(period*(xPos)*Math.PI)));
                yPos = amplitude*(Math.sin(xPos/period));
                displayOffset = (int)(Math.round((amplitude+yPos)*20));
                //System.out.println(sineValue +"/"+totalPosition);
                /*for (int i = 0; i < displayOffset; i++) {
                    System.out.print(" ");
                }*/
                System.out.print(" ".repeat(displayOffset));
                System.out.println(".");
                xPos+= 0.1;  
            }
        } else {
            double minimum = 0.0;
            double max;
            double sineValueFourDecPl;
            double maxtotal = 10*Math.abs(amplitude*(Math.sin(period*(0.5)*Math.PI)));
            final int CONSOLE_SIZE_COLUMNS = 120;
            int consoleSizeRows;
            int consolePosition;
            int iterations = 1;
            System.out.println("Message");
            //String messageString = "Hello World" /*scnr.nextLine()*/;
            //int index;
            while (iterations > 0){
                consoleSizeRows = 16;
                while (consoleSizeRows > 0) {
                    System.out.print(consoleSizeRows);
                    xPos = 0;
                    consolePosition = 0;
                    while (consolePosition < CONSOLE_SIZE_COLUMNS) {
                        //yPos = 10*Math.abs(amplitude*(Math.sin(period*(xPos)*Math.PI)));
                        yPos = amplitude*(Math.sin(xPos/period));
                        //System.out.println(sineValue);
                        //System.out.print(minimum);
                        if (consoleSizeRows == 0) {
                            max = maxtotal * 1.0;
                        } else {
                            max = maxtotal/consoleSizeRows * 1.0;
                        }
                        sineValueFourDecPl = Double.parseDouble(String.format("%.6f",yPos));
                        if (sineValueFourDecPl > minimum && sineValueFourDecPl < max ) {
                                //index = (consolePosition%messageString.length());
                                System.out.print("*");
                                //System.out.print(messageString.charAt(1));

                        } else {
                                {System.out.print(" ");}
        
                        }
                        xPos +=0.01;
                        consolePosition++;
                    }
                        if (consoleSizeRows == 0) {
                        minimum = maxtotal;
                        } else {minimum = maxtotal/consoleSizeRows;}
                        consoleSizeRows--;
                    System.out.println();
                }
                iterations--;
            }
            
        }

    }

}