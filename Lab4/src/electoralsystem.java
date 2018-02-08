import java.util.Scanner;
public class electoralsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("How many electorates would you like to input?");
int input = scan.nextInt();

for(int x=1; x<=input; x++)
System.out.println("Enter your age");

int one=scan.nextInt();
if (one<18)
	System.out.println("You can't vote");
else if (one==18)
	System.out.println("You can vote");
else if (one>=18)
	System.out.println("You can vote and get a drivers license.");
 
	}

}
