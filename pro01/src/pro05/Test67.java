package pro05;

class Student2 {
	private String name;
	private int score;
	 
	//Student2(){}
	Student2(String name, int score){
		this.name = name;
		this.score = score;
	}	
	String getName() {
		return name;
	}
	
	int getScore() {
		return score;
	}
	
	/* 
	void setName(String name) {
		this.name = name;
	}
	
	void setScore(int score) {
		this.score = score;
	}
	*/
	// set은 변경자 이므로 주석처리
	
	void print() {
		System.out.println("name: " + name + "(" + score + ")" );
	} 
		
	
	
	}
	
	
public class Test67 {

	public static void main(String[] args) {
	
		Student2 st[] = new Student2[2];
		st[0] = new Student2("A", 40);
		st[1] = new	Student2("B", 60); 	
		
		
		//Student2 st[] = {new Student2("A", 40), new Student2("B", 60)};
		
				
		int total = 0;
		for(int i = 0; i < st.length; i++)
			total += st[i].getScore();
		
		double avg = (double) total / st.length;
		
		
		st[0].print();  // Student2 st[]가 묶여있지 않으므로 주소를 개별 선언해서 출력 
		st[1].print();
		
		System.out.println("평균: " + avg);
		
		
		
		
					
		}

	}


