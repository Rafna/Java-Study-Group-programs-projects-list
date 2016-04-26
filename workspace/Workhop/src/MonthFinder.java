//Display the month corresponding to the integer value entered in the program

import java.util.Scanner;

public class MonthFinder {
	public static void main(String args[]){
		System.out.println("Enter an integer value: ");
		Scanner input=null;
		try{
			input=new Scanner(System.in);
			int num=input.nextInt();
			switch(num){
			case 1: System.out.println("The month for the value entered is January");
			break;
			case 2: System.out.println("The month for the value entered is February");
			break;
			case 3: System.out.println("The month for the value entered is March");
			break;
			case 4: System.out.println("The month for the value entered is April");
			break;
			case 5: System.out.println("The month for the value entered is May");
			break;
			case 6: System.out.println("The month for the value entered is June");
			break;
			case 7: System.out.println("The month for the value entered is July");
			break;
			case 8: System.out.println("The month for the value entered is August");
			break;
			case 9: System.out.println("The month for the value entered is September");
			break;
			case 10: System.out.println("The month for the value entered is October");
			break;
			case 11: System.out.println("The month for the value entered is November");
			break;
			case 12: System.out.println("The month for the value entered is December");
			break;
			default: System.out.println("Month not exist for the value entered");
			break;
			}
		}
		finally{
			if(input!=null){
				input.close();
			}
		}
	}

}
/*Can do the same program with if-else statement
 * Also can alter the program by displaying the number of days in that month*/
