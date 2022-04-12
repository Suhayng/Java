package Chap19.EX06;

import java.io.IOException;
import java.io.InputStream;

/*
 	Windows : 콘솔, 메모장에서 Enter : \r\n	  , \r 생략 가능. write('\n')
 	
 */

public class ConsoleinputObject_2 {
	public static void main(String[] args) throws IOException {

		InputStream is = System.in;		//is 콘솔을 통해서 인풋을 받겠다.
			// System.in 은 한 페이지에서 중복해서 만들 수 없다. (오직 한번) 중간에 close()를 호출하면 두번 다시 인풋 못 받는다.

		//InputStream is2 = System.in;
		
		System.out.println("영문만 입력하세요. >>>");
		
		// 1. 1-byte 단위 읽기
		int data;
		while ((data = is.read()) != '\r') {	// 	'\r' 까지  <= is.read() 호출될 때 콘솔에서 인풋을 대기
			System.out.print((char)data);
		}
		is.read();		//10  <== '\n'		//버퍼에 \n 남아 있음. 버퍼에서 \n을 처리해 줘야 한다. 그렇지 않으면 다음 read() 에서 \n 들어가 버림.
			// '\n' 을 버퍼에서 끄집어 낸다.
		
		System.out.println();
		System.out.println();
		System.out.println("==============================");
		
		// 2. n-byte 읽기 ( byte[]의 처음 위치에서 읽은 데이터 저장)
		byte[] byteArray1 = new byte[100];	//콘솔에서 배열에 저장될 때, \r\n 까지 들어간다.	
		int count1 = is.read(byteArray1);	//count1 은 100, 100, 30, -1 
			//count1 배열에서 읽은 값의 개수를 저장.
		
		for(int i = 0; i < count1; i++) {
			System.out.print((char)byteArray1[i]);
			System.out.println(" : count1 = " + count1);
		}
		
		int count2 ;
		count2 = is.read(byteArray1);	//배열 내부의 \r\n 돌아간다.
 		System.out.println(new String(byteArray1, 0, count2));
		
		
		/*
		while ( (count2 = is.read(byteArray1)) != '\r' ) {	//콘솔에서 -1을 사용하지 않고, \r로 처리
			System.out.println(new String(byteArray1));
		}
		//is.read();	//  \n을 버퍼에서 끄집어 내어 줘야 한다. <== 버퍼에서 빼지 않아도 된다. 배열 내부에 \r\n 들어가서 
		*/
		System.out.println("==============================");
		
		// 3. n-byte 단위로 읽고 (length 만큼 읽어 와서 byte[] offset 위치에서 저장
		
		byte[] byteArray2 = new byte[8];
		int offset = 3;
		int length = 5;
		
		int count3 = is.read(byteArray2, offset, length);
		
		for(int i = 0; i < offset + length; i++) {
			System.out.print((char)byteArray2[i]);
		}
		
		is.close();	// 제일 마지막에 처리. 중간에 close() 하면 다시 호출이 불가능
		
		
		
		
		
		
		
		
		
		
	}
}
