package Chap19.EX08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

//������ �ڵ� 

public class EX_Reader_Writer_3 {

	public static void main(String[] args) {
		// 1. �ֿܼ��� �ѱ� �б�
		
			File file1 = new File("C:/temp/aaa.txt"); 
			File file2 = new File("C:/temp/bbb.txt");
			
			try {
				InputStreamReader isr = new InputStreamReader(System.in,"MS949");
				
				System.out.println("������ �Է��ϼ���. MS949�� �Էµ˴ϴ�.");
				
				int data;
				
				OutputStream os = new FileOutputStream(file1);
				OutputStreamWriter osw = new OutputStreamWriter(os, "MS949");
				while((data = isr.read())!= '\r') {
					osw.write((char)data);
				}
				
				osw.flush();
	
				
				InputStream is = new FileInputStream(file1);
				InputStreamReader isr1 = new InputStreamReader(is,"MS949");
				
				int data2;
				
				while((data2 = isr1.read()) != -1) {
					System.out.print((char)data2);
				}
					
				System.out.println();
				System.out.println("======================================");
				
				file2.createNewFile();
				InputStreamReader isr2 = new InputStreamReader(System.in);
				
				System.out.println("������ �Է��ϼ���. UTF-8�� �Էµ˴ϴ�.");
				
				int data3;
				
				OutputStream os2 = new FileOutputStream(file2);
				OutputStreamWriter osw2 = new OutputStreamWriter(os2, "UTF-8");
				
				while((data3 = isr2.read())!= '\r') {
					osw2.write((char)data3);
				}
				
				osw2.flush();
				
				System.out.println("========================================");
				
				InputStream is2 = new FileInputStream(file2);
				InputStreamReader isr3 = new InputStreamReader(is2,"UTF-8");
				
				int data4;
				
				while((data4 = isr3.read()) != -1) {
					System.out.print((char)data4);
				}
						
			}catch(Exception e) {}
			
	}

}
