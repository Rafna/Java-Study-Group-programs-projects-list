//Program to search a number from an array and print the index value
import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.List;

public class SearchNumArray {
	public static void main(String args[]){
		int numArray[]={1,2,5,6,7,45,6,74,787};	
		searchArray(numArray);
	}
	//Method1:
	 public static void searchArray(int numArray[]){
		Scanner input=null;
		boolean flag=false;
		System.out.println("Enter the number to be found: ");
		try{
			input=new Scanner(System.in);
			int n=input.nextInt();
			for(int i=0;i<numArray.length;i++){
				if(n==numArray[i]){
					flag=true;
					System.out.printf("The number found at %d\n ",i+1);
				}
			}
			if(flag==false){
				System.out.println("The number not present");
			}
		}
		finally{
			if(input!=null)
				input.close();
		}
	}
	//Method2:
	/*public static void searchArray(int numArray[]){
		Scanner input=null;
		System.out.println("Enter the number to be found: ");
		try{
			input=new Scanner(System.in);
			int n=input.nextInt();
			List<Integer> index=new ArrayList<Integer>();
			for(int i=0;i<numArray.length;i++){
				if(n==numArray[i]){
					index.add(i);
				}
			}
			if(index.isEmpty()){
				System.out.println("The number not present");
			}
			else{
				System.out.println("The number found at "+index);
			}
		}
		finally{
			if(input!=null)
				input.close();
		}
	}*/

}
