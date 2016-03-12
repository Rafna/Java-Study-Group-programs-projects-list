import java.util.Scanner;

public class AgeInFiveYears {
	
	public static void main(String[] args) {
		String name;
		int age, ageafter;
		System.out.print("Enter your name here: ");
		Scanner input = new Scanner(System.in);
		name = input.next();
		System.out.print("Enter your current age here: ");
		age = Integer.parseInt(input.next());
		ageafter = age+5;
		System.out.println("Your age after 5 years is "+ageafter);
	}

}
