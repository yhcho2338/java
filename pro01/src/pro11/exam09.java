package pro11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class exam09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		byte b[] = new byte[50];
		try {
			
			fis = new FileInputStream("data1.txt");
			fis.read(b);
			for (byte x: b) {
				System.out.print((char)x);
			}
				
		
		} catch(FileNotFoundException e) {
			System.out.println("data1.txt�� ���� ������.");
		} catch (IOException e) {
		        System.out.println(e);
		
		} finally {
			
			try {
				fis.close();
			}
			catch (IOException e) {
				System.out.println(e);
			}
			catch (NullPointerException e) {
				System.out.println("fis�� null ���� ���� �ֽ��ϴ�.");
			}
			
			
		}
		

	}
	
	
	// �����ʿ�

}
