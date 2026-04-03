import java.util.Scanner;

public class EnumPractice {

    public enum TrafficLights {
        RED, YELLOW, GREEN
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter a traffic light (RED, YELLOW, GREEN): ");
        String userInput = scnr.nextLine().toUpperCase();

        TrafficLights variableLight = TrafficLights.valueOf(userInput);

        switch (variableLight) {
            case RED:
                System.out.println("Stop the vehicle.");
                break;

            case YELLOW:
                System.out.println("Prepare to stop.");
                break;

            case GREEN:
                System.out.println("Go!");
                break;
        }

        scnr.close();
    }
}