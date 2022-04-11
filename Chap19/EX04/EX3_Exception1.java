package Chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/*
  	1. is1 		<== InputStream 객체		(절대 경로로 접근: Exception-ms949.txt), 예외처리
  	2. is2		<== InputStream 객체		(상대 경로로 접근: Exception-utf-8.txt), 예외처리(try~with resource로 예외처리)
  					close() 메소드를 자동으로 처리
  	
 */

public class EX3_Exception1 {
	public static void main(String[] args) {
		// 1. 절대 경로
		File inFile = new File("C:\\SUSU\\JAVA2\\src\\Chap19\\EX04\\Exception-ms949.txt");
		InputStream is1 = null;				// 전역 변수로 선언,  finally 블락에서 is1.close()
		byte[] arr = new byte[80];
		
		try {
			is1 = new FileInputStream(inFile);	// 객체 생성. FileInputStream 은 FileNotFoundException
		} catch (FileNotFoundException e) {
			System.out.println("파일이 존재 하지 않습니다. ");
		}
		
		int data = 0;
		try {
			while((data = is1.read(arr)) != -1) {	// IOException
				String str = new String(arr, 0, data, Charset.forName("MS949"));
				System.out.println(str);
			}
		} catch (IOException e) {
			System.out.println("파일을 읽지 못하는 예외가 발생되었습니다. ");
		}
		
		try {
			if(is1 != null) {
				is1.close();
			}
		}catch (IOException e) {
		}
		
		System.out.println("=============================");
		
		// 1-1 여러 Exception에 대해서  단일 try ~ catch 로 처리
		InputStream is1_1 = null;				// 전역 변수로 선언,  finally 블락에서 is1.close()
		byte[] arr1_1 = new byte[100];			
				// 한글 처리 #1 : byte[] 배열 선언 
				
		int data1_1 = 0;
		try {
			is1_1 = new FileInputStream(inFile);			//FileNotFoundException
			while((data1_1 = is1_1.read(arr1_1)) != -1) {	//IOException
				// 한글처리 #2 : read(byte 배열) 
				
				String str1_1 = new String(arr1_1, 0, data1_1, Charset.forName("MS949"));
				System.out.println(str1_1);
			}
		} catch (IOException e) {
			System.out.println("파일을 읽지 못하는 예외가 발생되었습니다. ");
		} finally {
			if(is1_1 != null) {
				try {
				is1_1.close();
			}catch (IOException e) {
		}
			}
		System.out.println("=============================");
		
		
		
		// 2. 상대 경로
		File inFile2 = new File("src\\Chap19\\EX04\\Exception-utf-8.txt");
		
		FileInputStream is2 = null;
		byte[] arr2 = new byte[100];
			//한글처리 #1
		int data2 = 0;

		try {
			is2 = new FileInputStream(inFile2);
			// try (with resource : 객체 생성 , RAM을 사용) <== close() 자동으로 처리된다. AutoCloseable close() 구현한 클래스여야 한다.
			
			while ( (data2 = is2.read(arr2)) != -1) {      
					//한글처리 #2 : is2.read(byte배열)
				
				String str2 = new String(arr2, 0, data2, Charset.forName("UTF-8"));
					//한글처리 #3 : new String( byte배열, [offset, length], "enconding") 
				System.out.println(str2);
			}
		}  catch (IOException e) {
			System.out.println("예외가 발생 했습니다. ");
		} 
				}
			}
	
	
		
		
	

}
