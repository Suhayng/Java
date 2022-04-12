package Chap19.EX06;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/*
 	콘솔에서 한글 100byte 이하를 인풋 받은 값을 input.txt 에 저장 후 , Charactorset : Default
 	input.txt 파일에서 값을 읽어서 콘솔(System.out)에 출력
 	
 	1. system.in : 콘솔에서 인풋
 	2. FileoutputStream : 인풋 받은 값을 파일에 저장
 	3. FileInputStream : 저장된 파일의 값을 읽어옴
 	4. System.out : 콘솔에 출력
 	
 */


public class EX06_ConcoleInputOutputObject {
	public static void main(String[] args) throws IOException {
		// 1. system.in : 콘솔에서 인풋
		InputStream is = System.in;
		
		System.out.println("한글을 입력하세요.");
		
		byte[] byteArray = new byte[100];
		int count = is.read(byteArray);
		
		// 	2. FileoutputStream : 인풋 받은 값을 파일에 저장
		File outFile = new File("src/Chap19/EX06/input.txt");
		OutputStream os = new FileOutputStream(outFile);
		
		//String str = new String(byteArray, 0, count, Charset.defaultCharset());
		
		os.write(byteArray);	
		os.flush();
		
		// 3. FileInputStream : 저장된 파일의 값을 읽어옴
		File inFile = new File("src/Chap19/EX06/input.txt");
		InputStream is2 = new FileInputStream(inFile);
		byte[] byteArray2 = new byte[100];
		
		int count2;
		
		while((count2 = is2.read(byteArray2)) != -1) {
			System.out.println(new String(byteArray2, Charset.defaultCharset()));
		}
		
		// 4. System.out : 콘솔에 출력
		
		OutputStream os2 = System.out;
		
		
		
		
		
		
		
		
	}
}
