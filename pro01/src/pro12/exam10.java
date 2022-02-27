package pro12;

import java.util.Iterator;
import java.util.TreeSet;

public class exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {5,7,1,2,10,6,3,9,8,4};
		TreeSet<Integer> ts = new TreeSet<Integer>(); // 뒤에 Integer 생략가능? 
		for(int i=0; i<A.length; i++) { // 배열이라 length
			ts.add(A[i]);
		}
			System.out.println(ts);
		
		
		Iterator<Integer> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
		
		
		

	}

}
