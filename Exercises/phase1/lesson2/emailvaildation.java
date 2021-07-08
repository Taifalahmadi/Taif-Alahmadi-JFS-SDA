package lesson2;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class emailvaildation{
	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		System.out.println("Enter your email");
		String email = user.nextLine();
		String str = "^(.+)@(.+)$";	 
		Pattern pattern = Pattern.compile(str);
	    Matcher m = pattern.matcher(email);
		if (m.matches()) {
			System.out.println("vaild email");
		}
		else {
			System.out.println("invalid email");
		}
		
	}
	
	
	

	

}
