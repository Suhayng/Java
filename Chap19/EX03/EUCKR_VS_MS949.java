package Chap19.EX03;

import java.io.UnsupportedEncodingException;

/*
 	*EUCKR - 한국 표준, 한글 표현 가능 전체 중 표기 가능한 것만 구성되어 있음.
 			영문 : 1byte, 한글 : 2byte, 웹페이지로 출력 할 때
 			
 	*MS-949 - Microsoft 사에서 개발한 한글 표기 방식. 11000 모두를 표기할 수 있다.
			영문 : 1byte, 한글 : 2byte
 	
 	*UTF-8 : 모든 서버 (Web, FTP, Mail, ...), git, MAC
 			영문 : 1byte, 한글 : 3byte
 			
 	*UTF-16 : 고정 길이
 			영문, 한글 모두 2byte로 처리
 			
 	*문자를 해당 인코딩 타입으로 바이트 스트림으로 생성한 경우, 해당 인코딩 타입을 조합을 해야 깨어지지 않는다.
 	
 	*이클립스에서 인코딩 타입 설정 3가지
 		1. 전역 설정 :
 		2. 프로젝트에서 설정 :
 		3. 파일에서 설정 :
 		
 		- 우선순위 : 파일 > 프로젝트 > 전역
*/

public class EUCKR_VS_MS949 {
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		// 1. 영문자를 byte로 내보내고 String 으로 변환
		
		byte[] b1 = "a".getBytes("EUC-KR");	//문자를 Byte로 변환 --> 네트워크를 문자로 byte 스트링으로 변환해서 전송
			// 예외가 발생함 (UnsupportedEncodingException) -> 오타가 발생할 경우 인코딩 할 수 없는 예외가 발생이됨.
		byte[] b2 = "a".getBytes("MS949");
		
		System.out.println(b1.length); 		//1
		System.out.println(b2.length); 		//1

		System.out.println(new String(b1, "EUC-KR"));	//byte[] ==> 문자열로 바꿈
		System.out.println(new String(b2, "MS949"));
		
		System.out.println();
		
		// 2. 한글을 byte로 내보내고 String 으로 가져오기
		byte[] b3 = "a".getBytes("EUC-KR");	
		byte[] b4 = "a".getBytes("MS949");	
		
		System.out.println(b3.length); 
		System.out.println(b4.length); 
		
		System.out.println(new String(b3, "EUC-KR"));
		System.out.println(new String(b4, "MS949"));

		// 3. EUC-KR 현재 사용 가능한 것만 표기. 약 2000자
		// MS949는 11,000자를 모두 표기됨
		byte[] b5 = "뷁".getBytes("EUC-KR");		//11,000자 중 2000만 표기, 8000(x)	
		byte[] b6 = "뷁".getBytes("MS949");		//11,000자 모두 처리
		
		System.out.println(b5.length); 		//1
		System.out.println(b6.length); 		//2
		
		System.out.println(new String(b5, "EUC-KR"));
		System.out.println(new String(b6, "MS949"));

	
	
	
	
	
	
	}
}
