package Chap19.EX06;

import java.io.IOException;
import java.io.InputStream;

/*
 	System.in : Console에서 인풋을 받는 자바에서 제공해 주는 객체, InputStream
 	 		- Windows : 콘솔에서 Enter : \r\n
 	 		- Mac : 콘솔에서 Enter : \n
 	 		
 	System.out : Console로 출력을 하는 객체, OutputStream 
 	
 */

public class ConsoleInputObject_1 {
	public static void main(String[] args) throws IOException {

		//스트림은 한번 사용하면 재사용이 불가능
		
		//1. Console 에서 인풋 받기위한 객체 생성
		InputStream is1 = System.in;			//is1 는 콘솔에서 인풋 받아서 처리하는 객체 
		
		System.out.println("영문을 입력하세요 >>>");
		
		int data ;
		
		while( (data = is1.read()) != '\r' ) {	//1byte 씩 읽어서 int data 변수에 할당. 
			System.out.println("읽은 데이터 : " + (char)data + "남은 바이트 수 : " + is1.available());
		}
		
		System.out.println(data);			//13 -> \r
		System.out.println(is1.read());		//10 -> \n	
		
		System.out.println("=============================");
		

		while( (data = is1.read()) != '\r' ) {	//1byte 씩 읽어서 int data 변수에 할당. 
			System.out.print((char)data);
		}
		
	
	}
}
