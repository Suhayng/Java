package Chap14.EX09;

class seaonException extends Exception {	
	public seaonException() {
		super();
	}
	public seaonException(String message) {
		super(message);
	}
}

class weekException extends Exception {	
	public weekException() {
		super();
	}
	public weekException(String message) {
		super(message);
	}
}

class scoreKorException extends Exception {	
	public scoreKorException() {
		super();
	}
	public scoreKorException(String message) {
		super(message);
	}
}

class scoreEngException extends Exception {	
	public scoreEngException() {
		super();
	}
	public scoreEngException(String message) {
		super(message);
	}
}

class userIDException extends Exception {	
	public userIDException() {
		super();
	}
	public userIDException(String message) {
		super(message);
	}
}

class A { // 실행 클래스
	String season; 	// 봄, 여름, 가을, 겨울 ( 예외 발생: 봄, 여름 , 가을, 겨울만 입력하세요 )
	String week;	// 월,화,수,목,금,토,일 ( 예외 발생 : 월, 화, 수, 목, 금, 토, 일만 입력하세요 )
	int scoreKor;	// 0 ~ 100 값만 입력 ( 예외 발생 :  0 ~ 100까지 정수만 입력하세요 )
	int scoreEng;	// 0 ~ 100 값만 입력 ( 예외 발생 :  0 ~ 100까지 정수만 입력하세요 )
	String userID;	// 12자 이상 20자 사이의 문자 ( 예외 발생 : 12자 이상 20자 사이의 문자만 넣으세요 )

	
	
	void checkSeason (String season) throws seaonException {
		if (season != "봄" ) {
			throw new seaonException("예외 발생: 봄, 여름 , 가을, 겨울만 입력하세요"); 
		} else {
			System.out.println("정상적으로 잘 입력 되었습니다.");
			this.season = season;
			System.out.println("계절은 : " + this.season);
		}
	}

	
	
	void  checkWeek (String week) throws weekException {
		if (season != "월"||season != "화"||season != "수"||season != "목"||season != "금"||season != "토"||season != "일") {
			throw new weekException("예외 발생 : 월, 화, 수, 목, 금, 토, 일만 입력하세요 ");
		} else {
			System.out.println("정상적으로 잘 입력 되었습니다.");
			this.week = week;
			System.out.println("요일은 : " + this.week);
		}
	}

	
	void  checkscoreKor (int scoreKor) throws scoreKorException {
		if (scoreKor < 0 ) {
			throw new scoreKorException("예외 발생 :  0 ~ 100까지 정수만 입력하세요 ");
		} else if (scoreKor > 100) {
			throw new scoreKorException("예외 발생 :  0 ~ 100까지 정수만 입력하세요 ");
		} else {
			System.out.println("정상적으로 잘 입력 되었습니다.");
			this.scoreKor = scoreKor;
			System.out.println("국어 점수는 : " + this.scoreKor);
		}
	}

	void  checkscoreEng (int scoreEng) throws scoreEngException {
		if (scoreEng < 0 ) {
			throw new scoreEngException("예외 발생 :  0 ~ 100까지 정수만 입력하세요 ");
		} else if (scoreEng > 100) {
			throw new scoreEngException("예외 발생 :  0 ~ 100까지 정수만 입력하세요 ");
		} else {
			System.out.println("정상적으로 잘 입력 되었습니다.");
			this.scoreEng = scoreEng;
			System.out.println("영어 점수는 : " + this.scoreEng);
		}
	}

	
	
	void  checkuserID (String userID) throws userIDException {
		if (userID.length() < 12 || userID.length() > 20) {
			throw new userIDException("예외 발생 : 12자 이상 20자 사이의 문자만 넣으세요" );
		} else {
			System.out.println("정상적으로 잘 입력 되었습니다.");
			this.userID = userID;
			System.out.println("학번은 : " + this.userID);
		}
	}

	

}




public class UserException_EX {
	public static void main(String[] args) {
		
		A a = new A();
		
			try {
				a.checkSeason("봄");
			} catch (seaonException e) {
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
		
			System.out.println("===================================");
			
			try {
				a.checkWeek("월");
			} catch (weekException e) {
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
			
			System.out.println("====================================");
			
		    try {
				a.checkscoreKor(100);
			} catch (scoreKorException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage());
			}
		    
			System.out.println("===================================");
			
		    try {
				a.checkscoreEng(-2);
			} catch (scoreEngException e1) {
				// TODO Auto-generated catch block
				System.out.println(e1.getMessage());
			}
			
			System.out.println("===================================");
			
			try {
				a.checkuserID("1555555555234");
			} catch (userIDException e) {
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
	
	}
}


