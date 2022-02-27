package pro11;

import java.io.FileWriter;
import java.io.IOException;

public class exam11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] cbuf = {'J', 'A', 'V', 'A'};
		String lang = "Language";
		FileWriter fos = null;
		
		try {
			
			fos = new FileWriter("data5.txt");
			fos.write(cbuf);
			fos.write("\n-------------------------\n");
			// \n 이 뭔지 다시 공부 
			
			fos.write(lang);
			// fos.append("!"); 
			// 추가 되는지 실험
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		finally {
			try {
				fos.close();
			}
			catch(IOException e) {
				System.out.println(e);
			}
		}
		
		
		

	}

}
