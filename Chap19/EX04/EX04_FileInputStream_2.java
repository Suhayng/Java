package Chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/*
 * FileInputStream
 	is1 : MS949 한글로 읽기 처리, try (with resource), 예외 처리
 	is2 : UTF-8 한글 읽기 처리, try  예외 처리
 */


public class EX04_FileInputStream_2 {
	public static void main(String[] args) {
		// 1. MS949
		
		File inFile = new File("src\\Chap19\\EX04\\files\\file-ms949.txt");
		InputStream is1 = null;
		byte[] arr = new byte[100];
		int data= 0;
		
		try {
			is1 = new FileInputStream(inFile);
			while((data = is1.read(arr)) != -1) {
				String str =new String(arr, Charset.forName("MS949"));
				System.out.println(str);}
		} catch (IOException e) {
			System.out.println("예외가 발생 됐습니다.");
		} finally {
			if(is1 != null) {
				try {
					is1.close();
				}catch (IOException e) {
			}
				}
		
		
		File inFile2 = new File("src\\Chap19\\EX04\\files\\file-utf-8.txt");
		byte[] arr2 = new byte[1000];
		int data2= 0;
		
		try (InputStream is2 = new FileInputStream(inFile2);){
			while((data2 = is2.read(arr2)) != -1) {
				String str2 =new String(arr2, Charset.forName("UTF-8"));
				System.out.println(str2);}
		} catch (IOException e) {
			System.out.println("예외가 발생 됐습니다.");
		} 
		
		}	
	}
}
