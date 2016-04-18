import java.util.Scanner;

//Enter a String and program will reverse it and print

public class StringReverse {
	public static void main(String args[]){
		//Method 1:
		Scanner input=null;
		int length=0;
		String reverse=" ";
		System.out.println("Enter a String: ");
		try{
			input=new Scanner(System.in);
			String str=input.nextLine();
			length=str.length();
			if(str==null||str.isEmpty()){
				System.out.println("Reversed string:"+str);
			}
			for(int i=length-1;i>=0;i--){
				reverse=reverse+str.charAt(i);
				
			}
			System.out.println("Reversed string:"+reverse);
		}
		finally{
			if(input!=null)
				input.close();
		}
	
		//Method 2:
		/*String str="awesome";
		String reverse=new StringBuffer(str).reverse().toString();
		System.out.println("Reversed String:"+reverse);
		*/
		//Method 3:
		/*String str="awesome life";
		String revers=reverse(str,str.length()-1);
		System.out.println("Reversed String:"+revers);
		*/
	}
}
	/*public static String reverse(String strtoreverse,int strlength){
		if(strlength==0){
			return strtoreverse.charAt(0)+"";
		}
		char c=strtoreverse.charAt(strlength);
		return c+reverse(strtoreverse,strlength-1);
		
	}
	*/
