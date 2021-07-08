package lesson1;
import java.util.Scanner;

public class calculator {


	
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.println("Welcome");
		System.out.println("------------------------");
		System.out.println("Type the number of the operation you want to perform:");
		System.out.println("1- Addition\n2-Subtraction\n3-Multiplication\n4-Division");
		System.out.println("------------------------");
		int n = user.nextInt();
		if(n==1) {
		System.out.println("Enter the first number ");
		int firstnumber = user.nextInt();
		System.out.println("Enter the second number ");
		int secondnumber = user.nextInt();
		int result = firstnumber+secondnumber;
		System.out.println(firstnumber+" + "+secondnumber+" = "+result);
		}
		else if (n==2) {
			System.out.println("Enter the first number ");
			int firstnumber = user.nextInt();
			System.out.println("Enter the second number ");
			int secondnumber = user.nextInt();
			int result = firstnumber-secondnumber;
			System.out.println(firstnumber+" - "+secondnumber+" = "+result);	
			
		}
		else if (n==3) {
			System.out.println("Enter the first number ");
			int firstnumber = user.nextInt();
			System.out.println("Enter the second number ");
			int secondnumber = user.nextInt();
			int result = firstnumber*secondnumber;
			System.out.println(firstnumber+" * "+secondnumber+" = "+result);	
			
		}
		else if (n==4) {
			System.out.println("Enter the first number ");
			int firstnumber = user.nextInt();
			System.out.println("Enter the second number ");
			int secondnumber = user.nextInt();
			int result = firstnumber/secondnumber;
			System.out.println(firstnumber+" / "+secondnumber+" = "+result);	
			
		}
	}
}