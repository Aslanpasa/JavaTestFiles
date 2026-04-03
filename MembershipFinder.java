import java.util.Scanner;

public class MembershipFinder {

   public static int findMuseumMembership(int numMuseumVisits, int personAge) {
      if (numMuseumVisits < 5) {
          if (personAge < 13) {
            return (int)75; 
         } else if (personAge <= 72) {
            return (int)80; 
         } else if (personAge > 72) {
            return (int)60;
         }
      }else if (numMuseumVisits < 11) {
          if (personAge < 13) {
            return (int)50; 
         } else if (personAge <= 72) {
            return (int)55; 
         } else if (personAge > 72) {
            return (int)40;
         }
      }else {
          if (personAge < 13) {
            return (int)30; 
         } else if (personAge <= 72) {
            return (int)35; 
         } else if (personAge > 72) {
            return (int)25;
         }
      }
      return(-1);
   }
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int museumVisits;
      int userAge;

      museumVisits = scnr.nextInt();
      userAge = scnr.nextInt();

      System.out.println(findMuseumMembership(museumVisits, userAge));
   }
}