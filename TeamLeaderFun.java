/*"We need the customer to enter their name and year of birth.
 We can't accept years after 2026, of course, but we need to 
 also allow them to not enter it if they don't want to. After
 all that, we need to show them what they've entered. If they
 haven't entered something, we have to show that differently." */
import java.util.Scanner;
 public class TeamLeaderFun {
    public static void main(String[] args) {
        String userName;
        int birthYear;
        Scanner scnr = new Scanner(System.in);
        System.out.print("Please input your name: ");
        userName = scnr.next();
        System.out.printf("Hello %s please input your birth year: ",userName);
        birthYear = Integer.parseInt(scnr.next());
        if ((birthYear <2026)&&(birthYear > 1901)) {System.out.printf("You are a valid age ");}
        else{System.out.printf("You are an invalid age");}
    }

    
}