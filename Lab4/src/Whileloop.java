import java.util.Scanner;
public class Whileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter a number");
int number=scan.nextInt();
while (number%5 !=0){
System.out.println("Enter a number");
number=scan.nextInt();
}
	}

}
