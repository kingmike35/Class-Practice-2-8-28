import java.util.Scanner;

public class askingquestion 
{
     public static void main ( String [] args)
     {
    	 Scanner Keyboard = new Scanner (System.in);
    	 
    	 int age;
    	 String height;
    	 double weight;
    	 
    	 System.out.print("How old are you?");
    	 age = Keyboard.nextInt();
    	 
    	 System.out.print("How tall are you?");
    	 height = Keyboard.next();
    	 
    	 System.out.print("How much do you weigh?");
    	 weight = Keyboard.nextDouble();
    	 
    	 System.out.println( "So you're "+ age + "old,"+ height + "tall and" + weight +"heavy.");
     }
}