package pro12;

import java.util.Iterator;
import java.util.TreeSet;

class Person implements Comparable<Person> {
	
	private int id;
	private int score;
	
	Person() {}
	Person(int id, int score) {
		this.id = id;
		this.score = score;
	}
	
	public String toString() {
		return "[id= " + id + ", score= " + score + "]";
	}
	
	public int compareTo(Person p) {
		return   this.id - p.id; // 대소비교연산자 공부
	}
	
	// 다른 클래스에 만들고 끌어와보기 
}




public class exam11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Person> ts = new TreeSet<Person>();
		
		ts.add(new Person(3, 83));
		ts.add(new Person(5, 90));
		ts.add(new Person(1, 93));
		ts.add(new Person(2, 88));
		ts.add(new Person(2, 70));
		
		
		Iterator<Person> itr = ts.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		

	}

}
