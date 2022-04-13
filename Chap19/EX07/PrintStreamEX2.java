package Chap19.EX07;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class PrintStreamEX2 {
	public static void main(String[] args) {
		//1.
		File outFile1 = new File("src\\Chap19\\EX07\\printstream1.txt");
		File outFile2 = new File("src\\Chap19\\EX07\\printstream2.txt");

		//2.
		try (PrintStream ps = new PrintStream(outFile1);	){
			
			ps.println(5.8); //double 출력			<== 출력 후 라인 개행
			ps.print(3 + " 안녕 " + 12345 + "\n");// <== 출력 후 라인 개행(x)
			ps.printf("%d 이 호출 되었습니다.", 7);	// "%d" : int 값을 호출
			ps.printf("%s %f", "안녕", 5.8);		// %s : string 호출, %f : double 호출

			//ps.flush() <== 자동으로 호출
		} catch (Exception e) {}
		
		try (InputStream is = new FileInputStream(outFile1);	){
			
			int count;
			byte[] byteArray1 = new byte[100];
			count = is.read(byteArray1);

			//ps.flush() <== 자동으로 호출
		} catch (Exception e) {}
		
		
		
		
	}

}
