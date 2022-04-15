package Chap19.EX08;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

//콘솔에서 인풋을 2번 받음. 

public class EX_Reader_Writer_1 {

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
			OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(fileA), "MS949");
			InputStreamReader reader = new InputStreamReader(System.in, "MS949");
			int data;
			while ((data = reader.read()) != '\r') {
				writer.write((char) data);
				writer.flush();
			}
			writer.close();

		} catch (IOException e) {
			System.out.println("Exception");
		}

		try {
			OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(fileB), "UTF-8");
			InputStreamReader reader = new InputStreamReader(System.in, "MS949");
			int data;
			while ((data = reader.read()) != '\r') {
				writer.write((char) data);
				writer.flush();
			}
			writer.close();

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
