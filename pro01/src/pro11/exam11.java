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
			// \n �� ���� �ٽ� ���� 
			
			fos.write(lang);
			// fos.append("!"); 
			// �߰� �Ǵ��� ����
			
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
