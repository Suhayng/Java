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

class A { // ���� Ŭ����
	String season; 	// ��, ����, ����, �ܿ� ( ���� �߻�: ��, ���� , ����, �ܿ︸ �Է��ϼ��� )
	String week;	// ��,ȭ,��,��,��,��,�� ( ���� �߻� : ��, ȭ, ��, ��, ��, ��, �ϸ� �Է��ϼ��� )
	int scoreKor;	// 0 ~ 100 ���� �Է� ( ���� �߻� :  0 ~ 100���� ������ �Է��ϼ��� )
	int scoreEng;	// 0 ~ 100 ���� �Է� ( ���� �߻� :  0 ~ 100���� ������ �Է��ϼ��� )
	String userID;	// 12�� �̻� 20�� ������ ���� ( ���� �߻� : 12�� �̻� 20�� ������ ���ڸ� �������� )

	
	
	void checkSeason (String season) throws seaonException {
		if (season != "��" ) {
			throw new seaonException("���� �߻�: ��, ���� , ����, �ܿ︸ �Է��ϼ���"); 
		} else {
			System.out.println("���������� �� �Է� �Ǿ����ϴ�.");
			this.season = season;
			System.out.println("������ : " + this.season);
		}
	}

	
	
	void  checkWeek (String week) throws weekException {
		if (season != "��"||season != "ȭ"||season != "��"||season != "��"||season != "��"||season != "��"||season != "��") {
			throw new weekException("���� �߻� : ��, ȭ, ��, ��, ��, ��, �ϸ� �Է��ϼ��� ");
		} else {
			System.out.println("���������� �� �Է� �Ǿ����ϴ�.");
			this.week = week;
			System.out.println("������ : " + this.week);
		}
	}

	
	void  checkscoreKor (int scoreKor) throws scoreKorException {
		if (scoreKor < 0 ) {
			throw new scoreKorException("���� �߻� :  0 ~ 100���� ������ �Է��ϼ��� ");
		} else if (scoreKor > 100) {
			throw new scoreKorException("���� �߻� :  0 ~ 100���� ������ �Է��ϼ��� ");
		} else {
			System.out.println("���������� �� �Է� �Ǿ����ϴ�.");
			this.scoreKor = scoreKor;
			System.out.println("���� ������ : " + this.scoreKor);
		}
	}

	void  checkscoreEng (int scoreEng) throws scoreEngException {
		if (scoreEng < 0 ) {
			throw new scoreEngException("���� �߻� :  0 ~ 100���� ������ �Է��ϼ��� ");
		} else if (scoreEng > 100) {
			throw new scoreEngException("���� �߻� :  0 ~ 100���� ������ �Է��ϼ��� ");
		} else {
			System.out.println("���������� �� �Է� �Ǿ����ϴ�.");
			this.scoreEng = scoreEng;
			System.out.println("���� ������ : " + this.scoreEng);
		}
	}

	
	
	void  checkuserID (String userID) throws userIDException {
		if (userID.length() < 12 || userID.length() > 20) {
			throw new userIDException("���� �߻� : 12�� �̻� 20�� ������ ���ڸ� ��������" );
		} else {
			System.out.println("���������� �� �Է� �Ǿ����ϴ�.");
			this.userID = userID;
			System.out.println("�й��� : " + this.userID);
		}
	}

	

}




public class UserException_EX {
	public static void main(String[] args) {
		
		A a = new A();
		
			try {
				a.checkSeason("��");
			} catch (seaonException e) {
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
		
			System.out.println("===================================");
			
			try {
				a.checkWeek("��");
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


