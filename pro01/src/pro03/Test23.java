package pro03;

public class Test23 {

	public static void main(String[] args) {
		
		
     int score = 80;
     char grade;
     
     switch(score) {
     case 90: 
    	 grade = 'A';
    	 break;
     case 80:
    	 grade = 'B';
    	 break;
     case 70:
    	 grade = 'C';
    	 break;
     default:
    	 grade = 'D';
    	 break;
     }
	
     System.out.println("grade: " + grade);
     
     
     int score1 = 80;
     char grade1;
     
     if (score1 == 90) {
    	 grade1 = 'A';
     }else if (score1 == 80) {
    	 grade1 = 'B';
     }else if (score1 == 70) {
    	 grade1 = 'C';
     }else {
    	 grade1 = 'D';
     }
     System.out.println("grade: " + grade1);

     
    int a = 10;
    int b = 5;
    long max;
    max = (a>b)?a:b;
    System.out.println(max);
    
     
     
     
	}

}
