

public class PhraseOMatic {

		public static void main(String[] args) {
		String[] list1={"developer","manager","engineer","director"};
		String[] list2={"programming","managing","building","guiding"};
		String[] list3={"java","team","project","company"};
		int l1=list1.length;
		int l2=list2.length;
		int l3=list3.length;
		int rand1=(int)(Math.random()*l1);
		int rand2=(int)(Math.random()*l2);
		int rand3=(int)(Math.random()*l3);
		String phrase=list1[rand1]+" "+list2[rand2]+" "+list3[rand3];
		System.out.println("The phrase we are randomly looking for is "+phrase);
		
		
	}

}
