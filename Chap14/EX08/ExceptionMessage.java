package Chap14.EX08;

public class ExceptionMessage {
	public static void main(String[] args) throws Exception {
		// 1. 예외 객체 생성시 메세지 전달 하지 않는 경우 
		
		try {
			throw new Exception(); 	// 강제 예외 발생, Exception의 기본 생성자 호출시 메세지 출력 되지 않음.
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("===================");
		// 2. 예외 객체 생성시 메세지 전달하는 경우
		
		try {
			throw new Exception("예외 메세지 출력");		// Exception 객체 생성자에 String 값을 넣어주면
		} catch (Exception e) {						// catch 블락에서 예외 메세지를 출력
			System.out.println(e.getMessage());
		}
	}
}
