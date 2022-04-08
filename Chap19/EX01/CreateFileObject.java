package Chap19.EX01;

import java.io.File;	// 파일과 폴더를 다루는 객체
import java.io.IOException;

/*
 	주의 ! 이클립스에서 파일을 생성시 C:\ 에 생성할 때 권한 문제로 인한 오류가 발생 될 수 있다.
 		1. 이클립스를 <<관리자 권한>> 으로 실행
 		2. 폴더 내부에 파일을 생성
 		
 	- File 객체 내에 폴더 식별자를 적용할 경우
 			C:\abc\abc.txt
 					
 		1. Windows 인 경우 : String path = "C:\\abc\\abc.txt"		"" 내에 특수 문자를 처리하기 위한 기호 \
 			   window 10 : String path = "C:/abc/abc.txt"
 		2. MAC 인 경우 : String path = "C:/abc/abc.txt"
 		
	- 호환을 위해서 공통적으로 사용할 수 있는 코드 작성
		String path = "C:"+ File.separator + "abc" + File.separator + "abc.txt"
 */

public class CreateFileObject {
	public static void main(String[] args) throws IOException {

		// 1. File 객체를 사용해서 폴더 생성 . 해당 파일이나 폴더가 존재하지 않는 경우
			File temDir = new File("C:/temp001");
			if(temDir.exists()) {		// 해당 경로에 파일이나 폴더가 존재하면 true, false
				temDir.mkdir();}		// 폴더 생성 명령어
			
			System.out.println(temDir.exists());	// 파일이 경로에 존재하면 true 아니면 false
			
		// 2. File 객체를 사용해서 파일 생성
			File newFile = new File("C:/temp001/newfile.txt");	// c:/ 파일을 생성할 경우 권한 문제로 파일 생성 예외 <= 이클립스를 관리자 권한으로 실행
			if(!newFile.exists()) {
				newFile.createNewFile();	//예외 처리 필요 
			}
			System.out.println(newFile.exists());
			System.out.println();
			
		// 3. 파일 구분자
			File newFile2 = new File("C:\\temp001\\newfile01.txt");		//Windows 10 하위 버전
			File newFile3 = new File("C:/temp001/newfile02.txt");		//Window 10, MAC
			if (!newFile2.exists()) {newFile2.createNewFile();}
			if (!newFile3.exists()) {newFile3.createNewFile();}
			System.out.println(newFile2.exists());
			System.out.println(newFile3.exists());
		
		// 모든 OS 에서 공통으로 식별 가능한 코드
			File newFile4 = new File("C:" + File.separator + "temp001" + File.separator + "newfile03.txt");
			if (!newFile4.exists()) {newFile4.createNewFile();}
			System.out.println(newFile4.exists());
			
		// 4. 절대 경로로 처리 : 다른 시스템으로 이동된 경우 그 시스템 환경에 맞도록 세팅이 필요
			File newFile5 = new File("C:/temp001/newfile05.txt");	//절대 경로로 처리
			System.out.println(newFile5.getAbsolutePath());			//file 객체에 저장된 파일의 절대 경로를 출력 
			
		// 5. 상대 경로로 처리 <== 권장 (현재 나의 작업 폴더의 위치를 알아야 한다.)	
			System.out.println(System.getProperty("user.dir"));		//현재 작업 폴더의 위치
				// 이클립스 실행 폴더 위치
			File newFile6 = new File("newFile06.txt");				//상대 경로로 출력
			if (!newFile4.exists()) {newFile4.createNewFile();}
			System.out.println(newFile6.getAbsolutePath());
	}
}
