import java.util.Scanner;
//Given two int values, return their sum. Unless the two values are the same, then return double their sum

public class Sum {

	public static void main(String[] args) {
		int sum=0;
		Scanner input=null;
		try{
			input=new Scanner(System.in);
			System.out.println("Enter first integer values: ");
			int a=input.nextInt();
			int b=input.nextInt();
			if(a==b)
				sum=(a+b)*2;
			else
				sum=a+b;
			System.out.println("The sum of integer values: "+sum);
		}
		finally{
			if(input!=null)
				input.close();
		}
		
	}

}
