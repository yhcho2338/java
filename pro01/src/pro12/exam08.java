package pro12;

import java.util.LinkedList;
import java.util.Queue;

public class exam08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<Integer> qu = new LinkedList<Integer>(); // 다형성의 예
		 qu.add(10);
		 qu.add(20);
		 qu.add(30);
		 
		 Integer data = qu.poll(); // 10, queue형은 first in / first out
		 System.out.println("poll 값은: " + data);
		 
		 qu.add(40);
		 
		 while (!qu.isEmpty()) {
			 System.out.println(qu.poll());
		 }
		 
		

	}

}
