package Chap19.EX08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//콘솔에서 한번 입력 받음. 

public class EX_Reader_Writer_2 {

	public static void main(String[] args) {

		File folderA = new File("C:\\Temp\\a");
		File folderB = new File("C:\\Temp\\b");
		if (!folderA.exists())
			folderA.mkdir();
		if (!folderB.exists())
			folderB.mkdir();

		File fileA = new File("C:\\Temp\\a\\aaa.txt");
		File fileB = new File("C:\\Temp\\b\\bbb.txt");

		// 파일 입력
		try {
			OutputStreamWriter MSwriter = new OutputStreamWriter(new FileOutputStream(fileA), "MS949");
			OutputStreamWriter UTFwriter = new OutputStreamWriter(new FileOutputStream(fileB),"UTF-8");
			InputStreamReader reader = new InputStreamReader(System.in, "MS949");
			int data;
			while ((data = reader.read()) != '\r') {
				MSwriter.write((char) data);
				MSwriter.flush();
				UTFwriter.write((char) data);
				UTFwriter.flush();
			}
			MSwriter.close();
			UTFwriter.close();

		} catch (IOException e) {
			System.out.println("Exception");
		}
		
		// 콘솔 출력
		
		try {
			InputStreamReader reader  = new InputStreamReader(new FileInputStream(fileA), "MS949");
			OutputStreamWriter writer = new OutputStreamWriter(System.out, "MS949");
			int data;
			while ((data = reader.read()) != -1) {
				writer.write((char)data);
				writer.flush();
			}
			reader.close();

		} catch (IOException e) {
			System.out.println("Exception");
		}
		
		System.out.println();
		
		try {
			InputStreamReader reader  = new InputStreamReader(new FileInputStream(fileB), "UTF-8");
			OutputStreamWriter writer = new OutputStreamWriter(System.out, "MS949");
			int data;
			while ((data = reader.read()) != -1) {
				writer.write((char)data);
				writer.flush();
			}
			reader.close();

		} catch (IOException e) {
			System.out.println("Exception");
		}

	}

}
