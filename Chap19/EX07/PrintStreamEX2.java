package Chap19.EX07;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class PrintStreamEX2 {
	public static void main(String[] args) {
		//1.
		File outFile1 = new File("src\\Chap19\\EX07\\printstream1.txt");
		File outFile2 = new File("src\\Chap19\\EX07\\printstream2.txt");

		//2.
		try (PrintStream ps = new PrintStream(outFile1);	){
			
			ps.println(5.8); //double ���			<== ��� �� ���� ����
			ps.print(3 + " �ȳ� " + 12345 + "\n");// <== ��� �� ���� ����(x)
			ps.printf("%d �� ȣ�� �Ǿ����ϴ�.", 7);	// "%d" : int ���� ȣ��
			ps.printf("%s %f", "�ȳ�", 5.8);		// %s : string ȣ��, %f : double ȣ��

			//ps.flush() <== �ڵ����� ȣ��
		} catch (Exception e) {}
		
		try (InputStream is = new FileInputStream(outFile1);	){
			
			int count;
			byte[] byteArray1 = new byte[100];
			count = is.read(byteArray1);

			//ps.flush() <== �ڵ����� ȣ��
		} catch (Exception e) {}
		
		
		
		
	}

}
