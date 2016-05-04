/*Create below pattern
      1
      1  2  1
      1  2  1  3  1  2  1
      1  2  1  3  1  2  1  4  1  2  1  3  1  2  1
      1  2  1  3  1  2  1  4  1  2  1  3  1  2  1  5  1  2  1  3  1  2  1  4  1  2  1  3  1  2  1
     */ 
import java.util.Scanner;

public class PatternPrgm {
	public static void main(String args[]){
		Scanner input=null;
		System.out.println("How many rows you need in the pattern? ");
		try{
			input=new Scanner(System.in);
			int n=input.nextInt();
			createPattern(n);
		}
		finally{
			if(input!=null)
				input.close();
		}
	}
	public static void createPattern(int depth){
		recursivePattern(1,null,depth);
	}
	public static void recursivePattern(int number,String s,int limit){
		if(number<=limit){
			if(s!=null){
				System.out.println();
			}
			if(s!=null){
				System.out.printf("%s %d %s",s,number,s);
			}
			else{
				s="";
				System.out.printf("%d", number);
			}
			if(s.equals("")){
				s+=number+""+s;
			}
			else{
				s+=" "+number+" "+s;
			}
			recursivePattern(++number,s,limit);
		}
	}
}

