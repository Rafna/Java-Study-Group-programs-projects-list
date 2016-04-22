import java.util.Scanner;
//Calculate user’s age after 5 years

public class AgeInFiveYears {
	
	public static void main(String[] args) {
		String name;
		int age, ageafter;
		Scanner input=null;
		input = new Scanner(System.in);
		try{
			System.out.print("Enter your name here: ");
			name = input.next();
			System.out.print("Enter your current age here: ");
			age = Integer.parseInt(input.next());
			ageafter = age+5;
			System.out.println(name+"'s age after 5 years is "+ageafter);	
		}
		finally{
			if(input!=null)
				input.close();
		}
		
	}

}

