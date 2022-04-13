package Chap19.EX08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriter_1 {
	public static void main(String[] args) {

		
		//1. FileWriter �� ���ؼ� ������ ���� (Default : MS949)
		File osw1 = new File("src\\Chap19\\EX08\\osw1.txt");
		
		try (Writer writer = new FileWriter(osw1);){
		
			writer.write("OutputStreamWriter ���� ���� �Դϴ�. \n".toCharArray()); //String�� char�迭�� ����
			writer.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�."); //string
			writer.write('\n');	//char ����
			writer.write("Good Bye !! \n\n");
			writer.flush();
			
		} catch (IOException e) {
		}
		
		// 2. FileWriter �� ����ؼ� (Default : MS949 ====> UTF-8 ���� ����)
		

		try (OutputStream os = new FileOutputStream(osw2);
			 OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");	
				){
		
			osw.write("OutputStreamWriter ���� ���� �Դϴ�. \n".toCharArray()); //String�� char�迭�� ����
			osw.write("�ѱ۰� ������ ��� ���ԵǾ� �ֽ��ϴ�."); //string
			osw.write('\n');	//char ����
			osw.write("Good Bye !! \n\n");
			osw.flush();
			
		} catch (IOException e) {
		}
		
		
	}
}
