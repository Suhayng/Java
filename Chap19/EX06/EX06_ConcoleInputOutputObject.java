package Chap19.EX06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/*
 	�ֿܼ��� �ѱ� 100byte ���ϸ� ��ǲ ���� ���� input.txt �� ���� �� , Charactorset : Default
 	input.txt ���Ͽ��� ���� �о �ܼ�(System.out)�� ���
 	
 	1. system.in : �ֿܼ��� ��ǲ
 	2. FileoutputStream : ��ǲ ���� ���� ���Ͽ� ����
 	3. FileInputStream : ����� ������ ���� �о��
 	4. System.out : �ֿܼ� ���
 	
 */


public class EX06_ConcoleInputOutputObject {
	public static void main(String[] args) throws IOException {
		// 1. system.in : �ֿܼ��� ��ǲ
		InputStream is = System.in;
		
		System.out.println("�ѱ��� �Է��ϼ���.");
		
		byte[] byteArray = new byte[100];
		int count = is.read(byteArray);
		
		// 	2. FileoutputStream : ��ǲ ���� ���� ���Ͽ� ����
		File outFile = new File("src/Chap19/EX06/input.txt");
		OutputStream os = new FileOutputStream(outFile);
		
		//String str = new String(byteArray, 0, count, Charset.defaultCharset());
		
		os.write(byteArray);	
		os.flush();
		
		// 3. FileInputStream : ����� ������ ���� �о��
		File inFile = new File("src/Chap19/EX06/input.txt");
		InputStream is2 = new FileInputStream(inFile);
		byte[] byteArray2 = new byte[100];
		
		int count2;
		
		while((count2 = is2.read(byteArray2)) != -1) {
			System.out.println(new String(byteArray2, Charset.defaultCharset()));
		}
		
		// 4. System.out : �ֿܼ� ���
		
		OutputStream os2 = System.out;
		
		
		
		
		
		
		
		
	}
}
