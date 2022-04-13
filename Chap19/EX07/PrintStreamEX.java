package Chap19.EX07;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/*
 	PrintStream : Filter Stream (추가 기능을 제공하는 Stream), 기반 스트림이  필요
 		- 다양한 방법으로 출력에 특화된 스트림이다. flush() 를 호출하지 않아도 자동으로 호출
 		- println(), print(), printf()
 		- 파일 출력, 콘솔 출력
 */

public class PrintStreamEX {
	public static void main(String[] args) {
		//1. File 객체 생성
		File outFile1 = new File("src\\Chap19\\EX07\\printstream1.txt");
		File outFile2 = new File("src\\Chap19\\EX07\\printstream2.txt");
		//2. PrintStream (FileOutputStream(File))
		
		try (OutputStream  os1 = new FileOutputStream(outFile1);
				PrintStream ps = new PrintStream(os1);	){	//Filter 스트림(추가 기능 제공), 기반 스트림이 필요
			
			ps.println(5.8); //double 출력			<== 출력 후 라인 개행
			ps.print(3 + " 안녕 " + 12345 + "\n");// <== 출력 후 라인 개행(x)
			ps.printf("%d 이 호출 되었습니다.", 7);	// "%d" : int 값을 호출
			ps.printf("%s %f", "안녕", 5.8);		// %s : string 호출, %f : double 호출

			//ps.flush() <== 자동으로 호출
			
		} catch (Exception e) {}
	
		// 3. PrintStream(File)
		
		try (PrintStream ps = new PrintStream(outFile1);
				){
			
			ps.println(5.8); //double 출력			<== 출력 후 라인 개행
			ps.print(3 + " 안녕 " + 12345 + "\n");// <== 출력 후 라인 개행(x)
			ps.printf("%d 이 호출 되었습니다.", 7);	// "%d" : int 값을 호출
			ps.printf("%s %f", "안녕", 5.8);		// %s : string 호출, %f : double 호출

			//ps.flush() <== 자동으로 호출
		} catch (Exception e) {}
		
		// 4. PrintStream ps = System.out;	<== 콘솔에 출력
	/*	
		try (
			 OutputStream os2 = System.out;
		     PrintStream ps = new PrintStream(os2);) {
			
			ps.println(5.8); //double 출력			<== 출력 후 라인 개행
			ps.print(3 + " 안녕 " + 12345 + "\n");// <== 출력 후 라인 개행(x)
			ps.printf("%d 이 호출 되었습니다.", 7);	// "%d" : int 값을 호출
			ps.printf("%s %f", "안녕", 5.8);		// %s : string 호출, %f : double 호출

		} catch (Exception e) {}
		
		System.out.println("====================");
	*/	
		
		// 5. PrintStream ps = System.out;	<== 콘솔에 출력
			
		try (
				 PrintStream ps = System.out;) {
				
				ps.println(5.8); //double 출력			<== 출력 후 라인 개행
				ps.print(3 + " 안녕 " + 12345 + "\n");// <== 출력 후 라인 개행(x)
				ps.printf("%d 이 호출 되었습니다.", 7);	// "%d" : int 값을 호출
				ps.printf("%s %f", "안녕", 5.8);		// %s : string 호출, %f : double 호출

			} catch (Exception e) {}
		
	}

}
