package pro11;

import java.io.FileOutputStream;
import java.io.IOException;

public class exam10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String content = "Hello Java Programmers";
		byte[] bytes = content.getBytes();
		FileOutputStream fos = null;
		
		
		try {
			fos = new FileOutputStream("data4.txt");
			fos.write(bytes);
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			
			try {
				fos.close();
			}
			catch (IOException e) {
				System.out.println(e);
				
			}
			
			
			
			
		}

	}

}
