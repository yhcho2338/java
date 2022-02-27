package pro12;

import java.util.Stack;

public class exam07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<Integer> stk = new Stack<Integer>();
		
		stk.push(10);
		stk.push(20);
		stk.push(30);
		
		Integer I = stk.pop();
		System.out.println("pop°ªÀº : " + I);
		
		stk.push(40);
		
		
		while (!stk.empty()) {
			System.out.println(stk.pop());
		}
		
	}

}
