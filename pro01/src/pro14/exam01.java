package pro14;

enum Cards {
	A, B, C, D
}

public class exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cards cd;
		System.out.println("Print out all cards");
		
		System.out.println("--------------");
		
		Cards all[] = Cards.values();
		for (Cards c : all) {
			System.out.println(c);
		}
		
		System.out.println("---------------");
		
		cd = Cards.valueOf("D");
		System.out.println("cd is " + cd);
		
		
		

	}

}
