import java.util.Scanner;
    
public class TimeLeftToLive {
public static void main(String args[]) {
   
    Scanner Scanner = new Scanner (System.in);
    
    System.out.println("Enter your name(then press enter): ");
    String name = Scanner.next();

    System.out.println("\nEnter your age(then press enter): ");
    int age = Scanner.nextInt();
    
    while (age <= 0 || age >= 105) {

    System.out.println("\nEnter your ACTUAL age(then press enter): ");
    age = Scanner.nextInt();
    
        }
    
    int Years = (int)(Math.random() * (105-age));
    int Months = (int)(Math.random() * 12);
    int Weeks = (int)(Math.random() * 4);
    int Days = (int)(Math.random() * 7);
    int Minutes = (int)(Math.random() * 60);
    int Seconds = (int)(Math.random() * 60);
   
    System.out.println("\n" + name + ", you have " + Years + " Year(s), " + Months + " Month(s), " + Weeks + " Week(s), " + Days + " Day(s), " + Minutes + " Minute(s) and " + Seconds + " Second(s)" + " left to live!");

    Scanner.close();    
      
  }
}