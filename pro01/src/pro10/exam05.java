package pro10;

public class exam05 {

	public static void main(String[] args) {
		// StringBuffer 코드 184 연습
		
		StringBuffer sb1 = new StringBuffer("Hi");
		
		StringBuffer sb2 = new StringBuffer();
		sb2.append("World");
		
		// 이어서
		
		StringBuffer sb3 = new StringBuffer(20);
		sb3.append("Java Programming is created by James Gosling");
		
		System.out.println(sb1);
		System.out.println(sb2);
		System.out.println(sb3);
		
		System.out.println(sb1.capacity());
		System.out.println(sb2.capacity());
		System.out.println(sb3.capacity());
		
		
		
		
		StringBuffer sb4 = new StringBuffer("Good Morning");
		sb4.append("!");
		sb4.append(" Alice!");
		System.out.println(sb4);
		
		
		StringBuffer sb5 = new StringBuffer("water");
		StringBuffer sb6 = new StringBuffer("wafer");
		System.out.println("sb5.charAt(2): " + sb5.charAt(2));
		



		
		StringBuffer sb = new StringBuffer("Hello world");
		
		sb.insert(5, ',');
		
		System.out.println("sb5.substring(7): " + sb.substring(7));
	}

}
