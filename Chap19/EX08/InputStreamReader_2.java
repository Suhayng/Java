package Chap19.EX08;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class InputStreamReader_2 {

	public static void main(String[] args) {
		
		//1. 콘솔 입력 (MS949) : default charset ,  byte 스트림. 
		
		try   {
			
			InputStreamReader isr = new InputStreamReader (System.in, "MS949");
			
			//InputStreamReder :  byte ==> char 로 변환 
			// System.in : 콘솔 입력, byte
			
			//isr 은 변환된 char  
			
			
			System.out.println("한글을 원하는 대로 입력 하세요 >>> ");
			
			int data; 
			while ( ( data = isr.read() ) != '\r' ) {    // 콘솔 입력 대기 
				System.out.print((char)data );
			}
			
			System.out.println();
			System.out.println(isr.getEncoding());
			
		} catch (Exception e) { } 
		
		System.out.println();
		System.out.println("==========================");
	
		
		//2. 콘솔 입력 (UTF-8 ) 
		
		try {
			InputStreamReader isr= new InputStreamReader (System.in, "UTF-8");
			System.out.println("한글을 원하는 대로 입력 하세요2 >>> ");
			
			int data; 
			while ( ( data = isr.read() ) != '\r' ) {    // 콘솔 입력 대기 
				System.out.print((char)data );
			}
			System.out.println();
			System.out.println(isr.getEncoding());
			
		} catch (Exception e) { } 

	}

}
