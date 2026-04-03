import java.util.Scanner;
public class ProgramSummary{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);
        int userScore;
        final String HEADER_1 = "";
        final String HEADER_2 = "Bronze";
        final String HEADER_3 = "Silver";
        final String HEADER_4 = "Gold";
        final String HEADER_5 = "Platinum";
        final String SCORE_RANGE_TXT = "Score Range";
        final String SCORE_RANGE_1 = "500 - 999 ";
        final String SCORE_RANGE_2 = "1000 - 1999";
        final String SCORE_RANGE_3 = "2000 - 2999";
        final String SCORE_RANGE_4 = "3000 + ";
        System.out.printf("%-14s%-14s%-14s%-14s%-14s\n",HEADER_1,HEADER_2,HEADER_3,HEADER_4,HEADER_5);
        System.out.printf("%-14s%-14s%-14s%-14s%-14s\n\n",SCORE_RANGE_TXT,SCORE_RANGE_1,SCORE_RANGE_2,SCORE_RANGE_3,SCORE_RANGE_4);
        System.out.print("Please enter the user's score:\n");
        userScore = Integer.parseInt(scnr.next());
        if (userScore < 500) {
            System.out.println("You have not yet made it into a league");
        } else if (userScore <1000) {
          System.out.println("Congratulations you have made it into the Bronze!!!");
        } else if (userScore <2000) {
          System.out.println("Congratulations you have made it into the Silver!!!");
        } else if (userScore <3000) {
          System.out.println("Congratulations you have made it into the Gold!!!");
        } else if (userScore >= 3000) {
          System.out.println("Congratulations you have made it into the Platinum!!!");
        }
        scnr.close();
    }   
}