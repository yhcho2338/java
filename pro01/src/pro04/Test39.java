package pro04;

public class Test39 {

	public static int[] makeArray(int size) {
	
	  int A[] = new int[size];
	    
	  for (int i = 0; i < size; i++)
		A[i] = i * i;
	  return A;
	
			
	}
	
	public static void main(String[] args) {
	
		int s = 5;
		int B[] = makeArray(s);
		
		for(int i = 0; i < B.length; i++)
			System.out.print(B[i] + " ");
				
		
		
		

	}

}
