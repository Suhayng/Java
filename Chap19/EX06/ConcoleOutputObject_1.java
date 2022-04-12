package Chap19.EX06;

import java.io.IOException;
import java.io.OutputStream;

public class ConcoleOutputObject_1 {
	public static void main(String[] args) throws IOException {

		OutputStream  os = System.out;			//System.out : �ֿܼ� ���. byte ���
		
		// 1. 1-byte ���
		os.write('J');
		os.write('A');
		os.write('V');
		os.write('A');
		os.write('\n');
		os.write('\r');		// ���ۿ����� ����Ǽ� �ִ�.
		
		 os.flush(); 		// ������ ������ �ֿܼ� ���
		 //os.close();
		 	
		// 2. n-byte  ��� --> byte �� �ֿܼ� ���
		 byte[] byteArray1 = "Hello!".getBytes();	// String  �� byte  �� ���ϤȤ�
		 
		 os.write(byteArray1);
		 os.write('\n');
	 	 os.flush();
	 	
	 	 // 3. n-byte ���
	 	 byte[] byteArray2 = "Better the last smile than the first laugher".getBytes();
	 	 os.write(byteArray2, 7, 8);	//
	 	 os.flush();
	 	 
	 	 os.close();
		
		
	}
}