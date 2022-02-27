package pro12;

import java.util.Iterator;
import java.util.LinkedList;

public class exam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ls = new LinkedList<String>();
		
		ls.add("red");
		ls.add("blue");
		ls.add("purple");
		ls.add("yellow");
		ls.add("green");
		
		
		for (String s : ls) {
			System.out.println(s);
		}
			
			System.out.println();
			
			
			Iterator<String> iter = ls.iterator();
			while (iter.hasNext()) {
				String t = iter.next();
				System.out.println(t);
			}
			
			
			
		}
		

	}


