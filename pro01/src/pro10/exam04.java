package pro10;

public class exam04 {

	public static void main(String[] args) {
		// String method ���� �ι�
		
		String str = new String("Java Programming");
		System.out.println("str.chaAt(7): " + str.charAt(9));
		
		String temp = new String("Java Coding");
		System.out.println("str.compareTo(temp): " + str.compareTo(temp));
		
		String temp2 = new String("Study");
		System.out.println("str.concat(temp): " + str.concat(temp2));
		
		String temp3 = new String("gram");
		String temp4 = new String("coding");
		System.out.println("str.contains(temp3): " + str.contains(temp3));
		System.out.println("str.contains(temp4): " + str.contains(temp4));
		
		System.out.println("str.indexOf('a'): " + str.indexOf('a'));
		System.out.println("str.lastIndexOf('a'): " + str.lastIndexOf('a'));
		
		
		System.out.println("str.length(): " + str.length());
		
		
		String str2 = str.replace('a', 'A');
		System.out.println("str.replace: " + str2);
		
		
		
		

	}

}
