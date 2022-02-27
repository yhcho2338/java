package pro05;

class Score5 {
	private int math;
	private int eng;
	
	Score5 (){}
	Score5 (int math, int eng){
		this.math = math;
		this.eng = eng;
	}
	
	int getMath() {return math;}
	int getEng() {return eng;}
	
	void setMath() {this.math = math;}
	void setEng() {this.eng = eng;}
	
	void incMath(int p) {this.math += p;}
	void incEng(int p) {this.eng += p;}
	
	
	
}

class Student5  {
	private String name;
	private Score5 score;
	
	Student5() {}
	Student5 (String name, Score5 score) {
		this.name = name;
		this.score = score;
	}
	
	String getName() {return name;}
	Score5 getScore() {return score;}
	
	void setName(String name) {this.name = name;}
	void setScore(Score5 score) {this.score = score;}
	
	void incScore5(int m, int e) {
		score.incMath(m);
		score.incEng(e);
	}
	
	void printStudent() {
		System.out.println(name + ": math (" + score.getMath() + "), English (" + score.getEng() + ")");
		
	}
	

	
	
}






public class Test68 {

	public static void main(String[] args) {
	
		Student5 s1 = new Student5 ("Alice" , new Score5(10, 20));
		
		// 다른 유형 연습
		
		s1.incScore5(3,5);
		
		s1.printStudent();
	}

}
