package FileWriterExam01;

import java.io.FileWriter;
import java.io.IOException;

public class exercise01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[] a = {'a'};
		String b1 = "overloding �ñ���";
		String b2 = "�����";
		
		FileWriter fw = null;
		
		
		try {
			fw = new FileWriter("selfexam01.txt");
			fw.write(a);
			fw.append("\n");
			fw.write(b1);
			fw.write(b2);
			
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				fw.close();
			}
			catch (IOException e) {
				System.out.println(e);
			}
			
		}
	}

}
