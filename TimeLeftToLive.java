import java.util.Scanner;
    
public class TimeLeftToLive {
@SuppressWarnings("ConvertToTryWithResources")
public static void main(String args[]) {
   
    Scanner Scanner = new Scanner (System.in);
    
    System.out.println("Enter your name(then press enter): ");
    String name = Scanner.next();

    System.out.println("\nEnter your age(then press enter): ");
    int age = Scanner.nextInt();
    
    while (age <= 0 || age >= 105) {
    
    //Only runs when the inputed age is less than or equal to 0 or greater than or equal to 105
    System.out.println("\nEnter your ACTUAL age(then press enter): ");
    age = Scanner.nextInt();
    
        }
    
    //Gives a random floating-point number between 0 (inclusive) and the number it's being mulitplied by (exclusive), 
    //for example with "Months": which would result in a number between 0 and 11, 
    //then uses integer casting to switch it from a double to an int, allowing only whole numbers 
    //**SEE "Explanation" TEXT FILE TO LEARN MORE!!**
    int Years = (int)(Math.random() * (105-age));
    int Months = (int)(Math.random() * 12);
    int Weeks = (int)(Math.random() * 4);
    int Days = (int)(Math.random() * 7);
    int Minutes = (int)(Math.random() * 60);
    int Seconds = (int)(Math.random() * 60);
   
    System.out.println("\n" + name + ", you have " + Years + " Year(s), " + Months + " Month(s), " + 
        Weeks + " Week(s), " + Days + " Day(s), " + Minutes + " Minute(s) and " + Seconds + " Second(s)" + " left to live!");

    Scanner.close();    
      
  }

}