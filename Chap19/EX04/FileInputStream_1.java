package Chap19.EX04;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStream_1 {
	public static void main(String[] args) throws IOException {

		//현재 작업 디렉토리 위치 확인
		System.out.println(System.getProperty("user.dir"));
		
		//1. 입력 파일 생성
			//절대 경로로 설정
		File inFile1 = new File("C:\\SUSU\\JAVA2\\src\\Char19\\FileInputStream_1.txt");
			//상대 경로로 설정
		File inFile = new File("src\\\\Char19\\\\FileInputStream_1.txt");
		
		// InputStream 객체를 생성해야 파일의 내용을 읽을 수 있다.
		InputStream is = new FileInputStream(inFile);
			//InputStream은 추상 클래스, 직접 객체 생성을 할 수 없다, 타입 지정은 가능하다.
		
		// 파일의 내용을 출력
		
		
		
		// UTF-8 : 영어 1byte, 한글 3byte
		// MS949 : 영어 1byte, 한글 2byte
		// EUC-KR : 영어 1byte, 한글 2byte
		// UTF-16 : 영어 2byte, 한글 2byte, 첫번째 BOM 2byte <- 식별자
		
		/* JAVA에서 줄바꿈 처리
		 	- UNIX 	  : \n
		 	- windows : \r\n		<==	\r 은 생략 해도 됨.		-콘솔이나 메모장에서 enter : \r\n
		 	- MAC 	  : \r
		*/
		// 한 바이트 데이터를 읽어서 char로 변환 후 출력	
												//read() 한 바이트를 읽어들임
		System.out.println(is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());	System.out.println((char)is.read());	System.out.println((char)is.read());
		
		
		System.out.println();
		System.out.println();
		
		
		// int read() : 한 바이트를 읽어서 값이 존잿할 경우 양수를 리턴 읽은 데이터가 존재하지 않을 경우 -1
		// while 문을 사용해서 한번에 출력
		
		InputStream is1 = new FileInputStream(inFile);
		
		int data;
		while((data = is1.read()) != -1) {		// 마지막 값까지 계속 순환	(-1 : 값이 더 이상 존재하지 않으면 -1)	
			System.out.println((char) data);
		}
			//중요 : is1.read() : 1byte를 읽어 들임
			//FileInputStream 은 반드시 index 0 번부터 읽어 들임
					//FileRandomAccess를 사용해서 임의의 index에서 읽어 들임
		
		System.out.println();
		
		
	}
}
