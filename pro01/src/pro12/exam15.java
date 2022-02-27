package pro12;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

class Person2 {
	private String name;
	private int score;
	
	Person2 () {}
	Person2 (String name, int score) {
		this.name = name;
		this.score = score;
		
	}
	
	
	public String toString() {
		return  "("  + name + "," + score + ")";
	}
	
	
}


public class exam15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer, Person2> map = new TreeMap<Integer, Person2>();
		
		map.put(3, new Person2("AA", 80));
		map.put(1, new Person2("BB", 70));
		map.put(2, new Person2("CC", 90));
		
		
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		
		System.out.println();
		
		for (Map.Entry<Integer, Person2> e : map.entrySet()) {
			Integer key = e.getKey();
			Person2 value = e.getValue();
			System.out.println(key + " : " + value);
			
		}
		
		System.out.println();
		
		Person2 val = (Person2)map.get(3);
		System.out.println("key 3 -> ");
		System.out.println(val);
		
		

	}

}
