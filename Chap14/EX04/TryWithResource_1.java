package Chap14.EX04;

import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResource_1 {
	public static void main(String[] args) {

		// 1. 수동 resource 해제 ( 기존 프로그램 사용 )	-- 코드가 길고 지저분하다.
		System.out.println("문자를 입력하세요 !");
		
		// 자동 메모리 해제
		try (InputStreamReader isr1 = new InputStreamReader(System.in);) {
			char input = (char) isr1.read();
			System.out.println("입력글자 = " + input );
		} catch (IOException e){ 
			e.printStackTrace();
		} // finally 블락을 생략하더라도 객체를 자동으로 close()

		
		InputStreamReader isr2 = null;	// 사용 후 반드시 메모리에서 객체를 삭제해야 한다. isr2.close()
		// System.in : 콘솔에서 입력을 받도록 처리.	1번만 인풋을 받을 수 있다. 
		// 객체가 종료 되면 두번 인풋을 받지 못한다.
		
		try {
			isr2 = new InputStreamReader(System.in);
			char input = (char) isr2.read();			// 일반 예외 ( checked 예외 ) :  IOException : 입력 예외
			System.out.println("입력 글자 = " + input);
		} catch (IOException e) {
			e.printStackTrace();  	// try{} 블락에서 예외가 발생될 경우 자세한 정보를 출력
		} finally { 	// 객체를 사용 후에 메모리 영역에서 삭제 
			// 리소스 해제 : isr2.close()
			if ( isr2 != null ) {
				try {
					isr2.close();			// 일반 예외 : IOException 
				} catch (IOException e) {
					e.printStackTrace();
				} 		
			}
		}
		
		
		// 2. 자동 resource 해제 ( Java 1.7 자동으로 리소스 해제 )	-- 코드가 간결하다. ( 필요 조건이 있다. )
				// 1) 사용하는 객체가 AutoCloseable 인터페이스를 구현한 객체여야 한다.
				// 2) 반드시 객체에 close() 가 존재 해야 한다.
				// 위의 2가지 조건을 만족할 때 자동 리소스 해제 
				// try(자동으로 리소스를 해제할 객체 선언){} catch{} finally{}
		
		// InputStreamReader 는 AutoCloseable 인터페이스를 구현하고 있다. close() 가지고 있다.
		// Try with Resource : try ( with resource : 객체 메모리 로드 ) {}
		try (InputStreamReader isr1 = new InputStreamReader(System.in);) {
			char input = (char) isr1.read();
			System.out.println("입력글자 = " + input );
		} catch (IOException e){ 
			e.printStackTrace();
		} // finally 블락을 생략하더라도 객체를 자동으로 close()
		
		
		
		
	}
}
