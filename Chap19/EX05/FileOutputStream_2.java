package Chap19.EX05;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;

//FileOutputStream 을 사용해서 한글 처리

public class FileOutputStream_2 {
	public static void main(String[] args) throws IOException {
		
		// 1. 저장할 파일 생성
		File outFile = new File ("src/Chap19/EX05/FileOutput2.txt");	//기본적으로 이클립스의 default charactorSet 으로 저장
		
		// 2. n-byte 단위 쓰기 처리 (byte[] 의 처음부터 끝까지 쓰기) <- 한글을 처리
		OutputStream os2 = new FileOutputStream(outFile);
		byte[] byteArray1 = "안녕하세요".getBytes(Charset.forName("MS949"));	//String -> byte[]에 저장 : getBytes(), 
				//한자 2byte 씩 처리됨. 총 10bytes 
		
		os2.write(byteArray1);
		os2.write('\n');
		
		os2.flush();
		os2.close();
		
		// 3. n-byte 쓰기 (byte[]의 offset 부터 length 개의 바이트 데이터 쓰기
		
		OutputStream os3 = new FileOutputStream(outFile, true);		//이어서 쓰기
		byte[] byteArray2 = "반갑습니다.".getBytes(Charset.forName("MS949"));
		//byte[] byteArray2 = "반갑습니다.".getBytes(Charset.delfaultCharset());  -> 기본 Charset 으로 가져오기
		
		os3.write(byteArray2, 2 ,2);	//갑, 2byte 띄우고 2byte를 읽는다.
			//write(byte[], offset, length);
		
		//영어, 숫자, 특수문자 <== ASCII 코드로 1byte 
		os3.flush();
		os3.close();
		
		
		
	
	
	
	
	
	
	
	
	}
}
