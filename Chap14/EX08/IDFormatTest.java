package Chap14.EX08;

// ID 의 값을 NULL 일 경우 Exception 발생
// userID가 : 8자 이상 20자가 아닌 경우 Exception

class IDFormatException extends Exception {		// 2개의 생성자만 구성
	public IDFormatException() {
		super();
	}
	public IDFormatException (String message) {	// 예외 발생시 예외 메세지가 출력, e.getMessage();
		super(message);
	}
}


public class IDFormatTest {
	private String userID ;			// 체크 : null, 8자 이상 20자가 아닌 경우 Exception
		//userID 캡슐화 됨. private : 외부나 다른 클래스에서 접근 차단.
			// 생성자, settor를 사용해서 값을 할당.
	
	public String getUserID () {	//geter	// 메소드 호출시 메모리의 userID를 던져줌
		return userID;
	}
	public void setUserID (String userID) throws IDFormatException {	// setter : 메모리의 값을 할당.
		
		if (userID == null) {
			throw new IDFormatException("아이디는 Null 일 수 없습니다.");
		} else if (userID.length() < 8 || userID.length() > 20) {
			throw new IDFormatException("아이디는 8자 이상 20자 이하로 사용 가능합니다.");
		} else {
			System.out.println("정상적으로 잘 입력되었습니다.");
		}
		this.userID = userID ;
	}
	
	
	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		
		// 1. userID 가 null 인 경우
		String userID = null;
		
		try {
			test.setUserID(userID); 		// setter 호출시 null 값을 입력 후 호출
		} catch (IDFormatException e){
			System.out.println(e.getMessage());
		}
		System.out.println("======================");
		
		// 2. userID를 7자를 넣은 경우
		userID = "1234567";
		
		try {
			test.setUserID(userID);
		} catch (IDFormatException e) {
			System.out.println(e.getMessage()); // 메세지 출력
		}
		
		
		
	}
}
