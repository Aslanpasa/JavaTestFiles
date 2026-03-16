public class Variables {
    //Main segment of code
    public static void main(String[] args) { 
        short age = 17; //Defines user age as a short 
        int ageInMonths = age * 12; //Calculates my age in months
        float ageInDays = age *364.25f;//Calculates age in days
        String name = "Levent"; //Defines my name
        char firstLetter = 'L'; //First Letter of my Name
        double favouriteNumber = 3.14159; //Defines my favorite number
        String studentNumber = "S4245800";// Defines my student number
        //Prints out a message to the console of my name and age
        System.out.println("Hello my name starts with " + firstLetter +" is " + name 
                            + " and I am " + age + " years old or "
                            + ageInMonths + " months or " 
                            + ageInDays + " days \n My student number is " + studentNumber + ". \n" +
                            "My favorite number is " + favouriteNumber);  
    }
}