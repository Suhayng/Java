package Chap19.EX03;

import java.io.UnsupportedEncodingException;

/*
 	*UTF-16 고정 길이 : 한글, 영문 모두 2byte 로 표기
 			제일 처음 2byte BOM식별 코드가 추가됨
 			
 	*UTF-8  가변 길이 : 한글 3byte, 영문 1byte
 */

public class UTF16_VS_UTF8 {
	public static void main(String[] args) throws UnsupportedEncodingException {

		byte[] b1 = "abc".getBytes("UTF-16");	//문자열을 --> byte[]
				// BOM 식별 코드 2byte
				// abc : 6byte
		
		byte[] b2 = "abc".getBytes("UTF-8");
		
		System.out.println(b1.length); 	//8 : BOM(2) + 6(abc)
		System.out.println(b2.length); 	//3
		
		System.out.println();
		System.out.println(new String(b1, "UTF-16"));
		System.out.println(new String(b1, "UTF-8"));
		
	}
}
