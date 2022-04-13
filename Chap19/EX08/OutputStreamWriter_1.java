package Chap19.EX08;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriter_1 {
	public static void main(String[] args) {

		
		//1. FileWriter 를 통해서 데이터 쓰기 (Default : MS949)
		File osw1 = new File("src\\Chap19\\EX08\\osw1.txt");
		
		try (Writer writer = new FileWriter(osw1);){
		
			writer.write("OutputStreamWriter 예제 파일 입니다. \n".toCharArray()); //String을 char배열을 저장
			writer.write("한글과 영문이 모두 포함되어 있습니다."); //string
			writer.write('\n');	//char 저장
			writer.write("Good Bye !! \n\n");
			writer.flush();
			
		} catch (IOException e) {
		}
		
		// 2. FileWriter 를 사용해서 (Default : MS949 ====> UTF-8 파일 쓰기)
		

		try (OutputStream os = new FileOutputStream(osw2);
			 OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");	
				){
		
			osw.write("OutputStreamWriter 예제 파일 입니다. \n".toCharArray()); //String을 char배열을 저장
			osw.write("한글과 영문이 모두 포함되어 있습니다."); //string
			osw.write('\n');	//char 저장
			osw.write("Good Bye !! \n\n");
			osw.flush();
			
		} catch (IOException e) {
		}
		
		
	}
}
