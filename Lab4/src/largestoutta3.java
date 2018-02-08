import java.util.Scanner;
public class largestoutta3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Input 3 numbers");
int one=scan.nextInt(); 
int two=scan.nextInt();
int three=scan.nextInt();
if (one>two && one>three)
	System.out.println("First number is largest");
else if (two>one && two>three)
	System.out.println("Second number is largest");
else if (three>one && three>two)
	System.out.println("Third number is largest");
	}

}
