//Enter two numbers and compare it and print the result
import java.util.Scanner;

public class IntegerComparison {

	public static void main(String[] args) {
		System.out.print("Enter two numbers: ");
		Scanner input=null;
		try{
			input=new Scanner(System.in);
			Integer number1=input.nextInt();
			Integer number2=input.nextInt();
			if(number1==number2){
				System.out.println("Two numbers "+number1+" and "+number2+" are equal with == operator");
			}
			else{
				System.out.println("Two numbers "+number1+" and "+number2+" are not equal with == operator");
			}
			number1=new Integer(number2);
			if(number1==number2){
				System.out.println("Two numbers "+number1+" and "+number2+" are equal with == operator after using new()");
			}
			else{
				System.out.println("Two numbers "+number1+" and "+number2+" are not equal with == operator after using new()");
			}
			if(number1.equals(number2)){
				System.out.println("Two numbers "+number1+" and "+number2+" are equal with equals method");
			}
			else{
				System.out.println("Two numbers "+number1+" and "+number2+" are not equal with equals method");
			}
			
			
		}
		finally{
			if(input!=null)
				input.close();
		}
	}

}
/*Different types of comparison is shown in the code, there are more comparison using type conversion like Long, Double etc with different operators. 
 * Also run the code by entering value of number1 and number2 outside -128 and 128, will get a different output than any other values because they are out of cache range 
 * These are for showing the auto-boxing in Java*/
